import java.util.ArrayList;
import java.util.List;

/**
 * University class demonstrates COMPOSITION
 * University "owns" its departments - strong ownership relationship
 * When a University closes, its departments cease to exist
 * The University creates and manages the lifecycle of its departments
 *
 * This is different from Aggregation:
 * - Composition: Strong "part-of" relationship (Department cannot exist without University)
 * - University creates its own Department objects
 * - When University is destroyed, Departments are also destroyed
 */
public class University {
    private String universityName;
    private String location;
    private List<Department> departments; // Composition - University owns these departments

    /**
     * Constructor for University
     * @param universityName Name of the university
     * @param location Location of the university
     */
    public University(String universityName, String location) {
        this.universityName = universityName;
        this.location = location;
        this.departments = new ArrayList<>();
        System.out.println("\n===========================================");
        System.out.println("University established: " + universityName);
        System.out.println("Location: " + location);
        System.out.println("===========================================");
    }

    /**
     * Create and add a new department to the university
     * This demonstrates COMPOSITION - University creates its own departments
     * Departments are created within the University and owned by it
     *
     * @param departmentName Name of the department
     * @param departmentCode Department code
     * @return The created department
     */
    public Department createDepartment(String departmentName, String departmentCode) {
        Department dept = new Department(departmentName, departmentCode);
        departments.add(dept);
        return dept;
    }

    /**
     * Display university information
     */
    public void displayInfo() {
        System.out.println("\n===========================================");
        System.out.println("UNIVERSITY: " + universityName);
        System.out.println("Location: " + location);
        System.out.println("Total Departments: " + departments.size());
        System.out.println("===========================================");

        for (Department dept : departments) {
            dept.displayInfo();
        }
    }

    /**
     * Close the university
     * Demonstrates the lifecycle in COMPOSITION
     * When University closes, all its departments are also shut down
     * (But professors can move to other universities - they're not destroyed)
     */
    public void closeUniversity() {
        System.out.println("\n===========================================");
        System.out.println("University " + universityName + " is closing...");
        System.out.println("===========================================");

        // Close all departments - they cease to exist with the university
        for (Department dept : departments) {
            dept.shutdown();
        }

        departments.clear();
        System.out.println("University " + universityName + " has been closed.");
        System.out.println("All departments have been shut down.");
    }

    // Getters
    public String getUniversityName() {
        return universityName;
    }

    public String getLocation() {
        return location;
    }

    public List<Department> getDepartments() {
        return new ArrayList<>(departments); // Return copy
    }
}
