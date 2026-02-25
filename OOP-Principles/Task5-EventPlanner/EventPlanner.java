/**
 * EventPlanner class demonstrates the DELEGATION pattern
 *
 * Key Concept:
 * Instead of implementing cooking and music logic itself (inheritance),
 * EventPlanner DELEGATES these tasks to specialized classes (Chef and Musician)
 *
 * Benefits of Delegation:
 * 1. Separation of Concerns - each class has a single responsibility
 * 2. Flexibility - can easily change chef or musician
 * 3. Reusability - Chef and Musician can be used by other classes
 * 4. Avoids inheritance complexity - "Favor composition over inheritance"
 *
 * EventPlanner doesn't know HOW to cook or play music
 * It just knows WHO to ask to do these tasks
 */
public class EventPlanner {
    private String plannerName;
    private Chef chef;        // Delegation: EventPlanner HAS-A Chef
    private Musician musician; // Delegation: EventPlanner HAS-A Musician

    /**
     * Constructor for EventPlanner
     * Takes Chef and Musician as dependencies (composition)
     *
     * @param plannerName Name of the event planner
     * @param chef The chef who will handle cooking
     * @param musician The musician who will handle entertainment
     */
    public EventPlanner(String plannerName, Chef chef, Musician musician) {
        this.plannerName = plannerName;
        this.chef = chef;
        this.musician = musician;
        System.out.println("\nEvent Planner: " + plannerName + " is ready!");
        System.out.println("Team assembled:");
        System.out.println("  - Chef: " + chef.getName());
        System.out.println("  - Musician: " + musician.getName());
    }

    /**
     * Host a party by DELEGATING tasks to specialists
     *
     * EventPlanner doesn't implement cooking or music logic
     * Instead, it delegates to chef.cookFood() and musician.playMusic()
     * This is the essence of the Delegation pattern
     */
    public void hostParty() {
        System.out.println("\n===========================================");
        System.out.println("  " + plannerName + " is hosting a party!");
        System.out.println("===========================================");

        System.out.println("\n" + plannerName + ": Welcome everyone to the party!");

        // DELEGATION: EventPlanner asks Chef to handle cooking
        System.out.println("\n" + plannerName + ": Let's get the food ready...");
        chef.cookFood();

        // DELEGATION: EventPlanner asks Musician to handle music
        System.out.println("\n" + plannerName + ": Time for some entertainment...");
        musician.playMusic();

        System.out.println("\n" + plannerName + ": Party is a success! Thank you all!");
        System.out.println("===========================================");
    }

    /**
     * Plan a corporate event with specific requirements
     */
    public void planCorporateEvent(String companyName) {
        System.out.println("\n===========================================");
        System.out.println("  Planning Corporate Event for " + companyName);
        System.out.println("===========================================");

        System.out.println("\n" + plannerName + ": Preparing corporate event...");

        // Delegate specific tasks
        chef.prepareMeal("Corporate Lunch");
        musician.performSong("Welcome Theme");

        System.out.println("\n" + plannerName + ": Corporate event setup complete!");
    }

    // Getters
    public String getPlannerName() {
        return plannerName;
    }

    public Chef getChef() {
        return chef;
    }

    public Musician getMusician() {
        return musician;
    }

    /**
     * Change chef (demonstrates flexibility of delegation)
     * @param newChef The new chef to work with
     */
    public void setChef(Chef newChef) {
        System.out.println("\n" + plannerName + " is now working with Chef " + newChef.getName());
        this.chef = newChef;
    }

    /**
     * Change musician (demonstrates flexibility of delegation)
     * @param newMusician The new musician to work with
     */
    public void setMusician(Musician newMusician) {
        System.out.println("\n" + plannerName + " is now working with Musician " + newMusician.getName());
        this.musician = newMusician;
    }
}
