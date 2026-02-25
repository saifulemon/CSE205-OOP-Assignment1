/**
 * Main class to demonstrate Abstraction in Java
 *
 * Key Concept:
 * - BankAccount is abstract - you cannot create an instance of it directly
 * - You must instantiate concrete classes like SavingsAccount or CurrentAccount
 * - Each concrete class provides its own implementation of calculateInterest()
 *
 * This demonstrates abstraction: hiding implementation details and showing
 * only essential features to the user
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("  OOP PRINCIPLE: ABSTRACTION");
        System.out.println("  Task: Bank Account System");
        System.out.println("===========================================");

        // Create a Savings Account with $10,000 balance
        SavingsAccount savings = new SavingsAccount("SA-1001", 10000.00);
        savings.displayAccountInfo();

        // Create a Current Account with $5,000 balance
        CurrentAccount current = new CurrentAccount("CA-2001", 5000.00);
        current.displayAccountInfo();

        // Demonstrate polymorphism with abstraction
        System.out.println("\n===========================================");
        System.out.println("  DEMONSTRATING POLYMORPHIC BEHAVIOR");
        System.out.println("===========================================");

        // Array of BankAccount references (abstract type)
        // But pointing to concrete objects (SavingsAccount and CurrentAccount)
        BankAccount[] accounts = {savings, current};

        double totalInterest = 0;
        for (BankAccount account : accounts) {
            totalInterest += account.calculateInterest();
        }

        System.out.println("\nTotal Interest Earned Across All Accounts: $" +
                         String.format("%.2f", totalInterest));

        // This line would cause a compilation error because BankAccount is abstract:
        // BankAccount account = new BankAccount("TEST-001", 1000); // ILLEGAL!

        System.out.println("\n===========================================");
        System.out.println("  Key Takeaway:");
        System.out.println("  Abstract classes define common behavior");
        System.out.println("  but cannot be instantiated directly.");
        System.out.println("  Concrete subclasses must implement");
        System.out.println("  all abstract methods.");
        System.out.println("===========================================");
    }
}
