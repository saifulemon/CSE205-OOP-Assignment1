/**
 * Professor class demonstrates AGGREGATION
 * Professors exist independently of departments
 * They can move from one department/university to another
 * Even if a department is destroyed, professors continue to exist
 *
 * This is the key difference from Composition:
 * - Composition: "Part-of" (Department is part of University - strong ownership)
 * - Aggregation: "Has-a" (Department has professors - weak relationship)
 */
public class Professor {
    private String name;
    private String professorId;
    private String specialization;

    /**
     * Constructor for Professor
     * Professor can be created independently, outside of any department
     * @param name Professor's name
     * @param professorId Unique identifier
     * @param specialization Area of expertise
     */
    public Professor(String name, String professorId, String specialization) {
        this.name = name;
        this.professorId = professorId;
        this.specialization = specialization;
        System.out.println("Professor " + name + " hired (ID: " + professorId + ")");
    }

    /**
     * Display professor information
     */
    public void displayInfo() {
        System.out.println("\n=== Professor Information ===");
        System.out.println("Name: " + name);
        System.out.println("ID: " + professorId);
        System.out.println("Specialization: " + specialization);
    }

    /**
     * Professor can teach (independent behavior)
     */
    public void teach(String subject) {
        System.out.println("Prof. " + name + " is teaching " + subject);
    }

    /**
     * Professor can conduct research (independent behavior)
     */
    public void conductResearch() {
        System.out.println("Prof. " + name + " is conducting research in " + specialization);
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getProfessorId() {
        return professorId;
    }

    public String getSpecialization() {
        return specialization;
    }
}
