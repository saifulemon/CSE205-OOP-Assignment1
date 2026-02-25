import java.util.ArrayList;
import java.util.List;

/**
 * Department class
 * Used in COMPOSITION relationship with University
 * Departments are created by and belong exclusively to a University
 * When the University is destroyed, Departments cease to exist
 *
 * Also demonstrates AGGREGATION with Professor
 * Professors can exist independently and can move between departments
 */
public class Department {
    private String departmentName;
    private String departmentCode;
    private List<Professor> professors; // Aggregation - professors can exist independently

    /**
     * Constructor for Department
     * @param departmentName Name of the department
     * @param departmentCode Unique code for the department
     */
    public Department(String departmentName, String departmentCode) {
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
        this.professors = new ArrayList<>();
        System.out.println("  -> Department created: " + departmentName + " (" + departmentCode + ")");
    }

    /**
     * Add a professor to this department
     * This is AGGREGATION - the professor exists independently
     * @param professor The professor to add
     */
    public void addProfessor(Professor professor) {
        if (!professors.contains(professor)) {
            professors.add(professor);
            System.out.println("    -> Professor " + professor.getName() + " added to " + departmentName);
        }
    }

    /**
     * Remove a professor from this department
     * Professor continues to exist (can move to another department)
     * @param professor The professor to remove
     */
    public void removeProfessor(Professor professor) {
        if (professors.remove(professor)) {
            System.out.println("    -> Professor " + professor.getName() + " removed from " + departmentName);
        }
    }

    /**
     * Display department information
     */
    public void displayInfo() {
        System.out.println("\n  === Department: " + departmentName + " ===");
        System.out.println("  Code: " + departmentCode);
        System.out.println("  Number of Professors: " + professors.size());
        if (!professors.isEmpty()) {
            System.out.println("  Professors:");
            for (Professor prof : professors) {
                System.out.println("    - " + prof.getName() + " (ID: " + prof.getProfessorId() + ")");
            }
        }
    }

    // Getters
    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public List<Professor> getProfessors() {
        return new ArrayList<>(professors); // Return copy to protect encapsulation
    }

    /**
     * This method is called when Department is being destroyed
     * Demonstrates the lifecycle in composition
     */
    public void shutdown() {
        System.out.println("  -> Department " + departmentName + " is being shut down");
        // Note: Professors are NOT destroyed - they can move to other departments (Aggregation)
        professors.clear();
    }
}
