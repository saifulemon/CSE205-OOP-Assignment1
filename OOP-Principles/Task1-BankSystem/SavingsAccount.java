/**
 * SavingsAccount class extends the abstract BankAccount class
 * Implements the calculateInterest() method with 5% interest rate
 * This demonstrates how concrete classes provide specific implementations
 * for abstract methods
 */
public class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.05; // 5% interest

    /**
     * Constructor for SavingsAccount
     * @param accountNumber Unique identifier for the account
     * @param balance Initial balance in the account
     */
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance); // Call parent constructor
    }

    /**
     * Implementation of abstract method from BankAccount
     * Calculates 5% interest on the current balance
     * @return The calculated interest amount
     */
    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    /**
     * Display savings account specific information
     */
    @Override
    public void displayAccountInfo() {
        System.out.println("\n=== Savings Account ===");
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + (INTEREST_RATE * 100) + "%");
        System.out.println("Interest Earned: $" + String.format("%.2f", calculateInterest()));
    }
}
