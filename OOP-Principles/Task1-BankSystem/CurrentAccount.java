/**
 * CurrentAccount class extends the abstract BankAccount class
 * Implements the calculateInterest() method with 0% interest rate
 * Current accounts typically don't earn interest but offer other benefits
 */
public class CurrentAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.0; // 0% interest

    /**
     * Constructor for CurrentAccount
     * @param accountNumber Unique identifier for the account
     * @param balance Initial balance in the account
     */
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance); // Call parent constructor
    }

    /**
     * Implementation of abstract method from BankAccount
     * Returns 0% interest for current accounts
     * @return The calculated interest amount (always 0)
     */
    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    /**
     * Display current account specific information
     */
    @Override
    public void displayAccountInfo() {
        System.out.println("\n=== Current Account ===");
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + (INTEREST_RATE * 100) + "%");
        System.out.println("Interest Earned: $" + String.format("%.2f", calculateInterest()));
    }
}
