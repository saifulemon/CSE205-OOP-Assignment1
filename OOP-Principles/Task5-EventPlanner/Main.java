/**
 * Main class to demonstrate the DELEGATION pattern
 *
 * DELEGATION vs INHERITANCE:
 *
 * WITHOUT Delegation (Inheritance approach - NOT recommended):
 *   class EventPlanner extends Chef, Musician { } // Can't do multiple inheritance in Java!
 *   - EventPlanner would need to know how to cook AND play music
 *   - Tight coupling
 *   - Hard to change behavior
 *
 * WITH Delegation (Composition approach - RECOMMENDED):
 *   class EventPlanner {
 *       Chef chef;
 *       Musician musician;
 *   }
 *   - EventPlanner delegates tasks to experts
 *   - Loose coupling
 *   - Easy to change chef or musician
 *   - Follows "Single Responsibility Principle"
 *
 * Real-world analogy:
 * You don't need to know how to fix a car to use one.
 * You DELEGATE car repairs to a mechanic.
 *
 * Quote: "Favor object composition over class inheritance" - Gang of Four
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("  OOP PRINCIPLE: DELEGATION");
        System.out.println("  Task: Event Planning System");
        System.out.println("===========================================");

        // Create specialists
        System.out.println("\n--- Hiring Specialists ---");
        Chef italianChef = new Chef("Marco Rossi", "Italian Cuisine");
        Musician guitarist = new Musician("Sarah Johnson", "Guitar");

        // Create EventPlanner with delegation
        System.out.println("\n--- Setting Up Event Planner ---");
        EventPlanner planner = new EventPlanner("Elite Events Co.", italianChef, guitarist);

        // Host a party - EventPlanner delegates work
        planner.hostParty();

        // Demonstrate changing team members (flexibility of delegation)
        System.out.println("\n\n===========================================");
        System.out.println("  DEMONSTRATING DELEGATION FLEXIBILITY");
        System.out.println("===========================================");

        Chef sushiChef = new Chef("Hiroshi Tanaka", "Japanese Cuisine");
        Musician pianist = new Musician("Emily Chen", "Piano");

        // Easy to change team members
        planner.setChef(sushiChef);
        planner.setMusician(pianist);

        // Host another event with new team
        System.out.println("\n--- Hosting Another Event with New Team ---");
        planner.hostParty();

        // Corporate event example
        System.out.println("\n\n===========================================");
        System.out.println("  CORPORATE EVENT EXAMPLE");
        System.out.println("===========================================");
        planner.planCorporateEvent("Tech Solutions Ltd.");

        // Create another planner with different team
        System.out.println("\n\n===========================================");
        System.out.println("  MULTIPLE EVENT PLANNERS");
        System.out.println("===========================================");

        Chef frenchChef = new Chef("Pierre Dubois", "French Cuisine");
        Musician violinist = new Musician("Anna Petrova", "Violin");

        EventPlanner premiumPlanner = new EventPlanner("Premium Events Inc.", frenchChef, violinist);
        premiumPlanner.hostParty();

        // Key Takeaways
        System.out.println("\n\n===========================================");
        System.out.println("  KEY TAKEAWAYS: DELEGATION PATTERN");
        System.out.println("===========================================");
        System.out.println("✓ EventPlanner does NOT implement cooking");
        System.out.println("  or music logic itself");
        System.out.println();
        System.out.println("✓ Instead, it DELEGATES to Chef and");
        System.out.println("  Musician objects");
        System.out.println();
        System.out.println("✓ Benefits:");
        System.out.println("  - Separation of concerns");
        System.out.println("  - Each class has single responsibility");
        System.out.println("  - Easy to change team members");
        System.out.println("  - Reusable components");
        System.out.println("  - Loose coupling");
        System.out.println();
        System.out.println("✓ Remember: \"Favor composition over");
        System.out.println("  inheritance\" - Gang of Four");
        System.out.println("===========================================");

        // Demonstrate that specialists can work independently
        System.out.println("\n===========================================");
        System.out.println("  SPECIALISTS WORK INDEPENDENTLY");
        System.out.println("===========================================");
        System.out.println("\nSpecialists can work outside of events too:");
        italianChef.cookFood();
        guitarist.playMusic();
    }
}
