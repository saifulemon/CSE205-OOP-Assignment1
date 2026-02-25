/**
 * Main class to demonstrate Composition and Aggregation
 *
 * KEY DIFFERENCES:
 *
 * COMPOSITION (Strong Relationship) - "Part-of"
 * - University HAS-A Department (owns it)
 * - Department cannot exist without University
 * - University creates its own departments
 * - When University is destroyed, Departments are destroyed too
 * - Example: Car and Engine (engine is part of car)
 *
 * AGGREGATION (Weak Relationship) - "Has-a"
 * - Department HAS-A Professor (uses it)
 * - Professor can exist independently
 * - Professor is passed to Department (not created by it)
 * - Professor can move to another department/university
 * - When Department closes, Professor continues to exist
 * - Example: Department and Professor (professor can change departments)
 *
 * Real-world Analogy:
 * - Your heart is COMPOSED in your body (can't exist separately)
 * - Your phone is AGGREGATED in your pocket (exists independently)
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("  OOP PRINCIPLES:");
        System.out.println("  - COMPOSITION (Strong Relationship)");
        System.out.println("  - AGGREGATION (Weak Relationship)");
        System.out.println("  Task: University System");
        System.out.println("===========================================");

        // Create a University
        University brac = new University("BRAC University", "Dhaka, Bangladesh");

        // COMPOSITION: University creates and owns departments
        System.out.println("\n--- Creating Departments (COMPOSITION) ---");
        Department cse = brac.createDepartment("Computer Science & Engineering", "CSE");
        Department math = brac.createDepartment("Mathematics", "MATH");
        Department physics = brac.createDepartment("Physics", "PHYS");

        // Create Professors independently (they exist on their own)
        System.out.println("\n--- Creating Professors (Independent Entities) ---");
        Professor prof1 = new Professor("Dr. Ahmed Rahman", "P001", "Artificial Intelligence");
        Professor prof2 = new Professor("Dr. Fatima Khan", "P002", "Database Systems");
        Professor prof3 = new Professor("Dr. Karim Hassan", "P003", "Quantum Physics");

        // AGGREGATION: Add professors to departments
        // Professors exist independently and can be assigned to departments
        System.out.println("\n--- Assigning Professors to Departments (AGGREGATION) ---");
        cse.addProfessor(prof1);
        cse.addProfessor(prof2);
        physics.addProfessor(prof3);

        // Display university structure
        brac.displayInfo();

        // Demonstrate Aggregation: Professor can move between departments
        System.out.println("\n\n===========================================");
        System.out.println("  DEMONSTRATING AGGREGATION");
        System.out.println("  (Professor moving departments)");
        System.out.println("===========================================");
        System.out.println("\nProf. Rahman is moving from CSE to MATH department:");
        cse.removeProfessor(prof1);
        math.addProfessor(prof1);

        // Professor still exists and can perform their duties
        System.out.println("\nProfessor still exists independently:");
        prof1.teach("Linear Algebra");
        prof1.conductResearch();

        // Display updated structure
        brac.displayInfo();

        // Demonstrate Composition: Closing university destroys departments
        System.out.println("\n\n===========================================");
        System.out.println("  DEMONSTRATING COMPOSITION");
        System.out.println("  (University closure affects departments)");
        System.out.println("===========================================");

        // Close the university
        brac.closeUniversity();

        // Professors still exist! They can move to another university
        System.out.println("\n--- Professors Still Exist ---");
        System.out.println("Even though the university closed:");
        prof1.displayInfo();
        prof2.displayInfo();
        prof3.displayInfo();

        System.out.println("\n--- Creating New University ---");
        University nsu = new University("North South University", "Dhaka, Bangladesh");
        Department nsucse = nsu.createDepartment("Computer Science", "CSE");

        System.out.println("\n--- Professors Join New University ---");
        nsucse.addProfessor(prof1);
        nsucse.addProfessor(prof2);

        nsu.displayInfo();

        // Summary
        System.out.println("\n\n===========================================");
        System.out.println("  KEY TAKEAWAYS");
        System.out.println("===========================================");
        System.out.println("COMPOSITION (University-Department):");
        System.out.println("  ✓ University OWNS departments");
        System.out.println("  ✓ Departments created by university");
        System.out.println("  ✓ Department lifecycle tied to university");
        System.out.println("  ✓ University closes → Departments destroyed");
        System.out.println();
        System.out.println("AGGREGATION (Department-Professor):");
        System.out.println("  ✓ Department HAS professors");
        System.out.println("  ✓ Professors exist independently");
        System.out.println("  ✓ Professors can move between departments");
        System.out.println("  ✓ Department closes → Professors survive");
        System.out.println("===========================================");
    }
}
