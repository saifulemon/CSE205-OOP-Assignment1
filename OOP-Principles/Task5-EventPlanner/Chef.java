/**
 * Chef class represents a specialist who knows how to cook
 * This class has its own specific responsibility: cooking food
 * Used in the Delegation pattern by EventPlanner
 */
public class Chef {
    private String name;
    private String specialty;

    /**
     * Constructor for Chef
     * @param name Name of the chef
     * @param specialty Chef's specialty cuisine
     */
    public Chef(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
        System.out.println("Chef hired: " + name + " (Specialty: " + specialty + ")");
    }

    /**
     * Chef's primary responsibility: cooking food
     * EventPlanner will DELEGATE this task to the Chef
     */
    public void cookFood() {
        System.out.println("\n--- Cooking Service ---");
        System.out.println("Chef " + name + " is preparing the food");
        System.out.println("Preparing " + specialty + " dishes...");
        System.out.println("Cooking appetizers...");
        System.out.println("Preparing main course...");
        System.out.println("Making desserts...");
        System.out.println("✓ All food is ready and served!");
    }

    /**
     * Additional chef functionality
     */
    public void prepareMeal(String mealType) {
        System.out.println("Chef " + name + " is preparing " + mealType);
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }
}
