/**
 * Abstract class demonstrating Abstraction principle in OOP
 * This class serves as a blueprint for different types of bank accounts
 * Common properties are defined here, but the interest calculation logic
 * is left abstract for subclasses to implement
 */
public abstract class BankAccount {
    // Common properties shared by all bank accounts
    private String accountNumber;
    private double balance;

    /**
     * Constructor to initialize bank account
     * @param accountNumber Unique identifier for the account
     * @param balance Initial balance in the account
     */
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Abstract method - each account type must implement its own interest calculation
     * This demonstrates abstraction: we define WHAT to do, not HOW to do it
     * @return The calculated interest amount
     */
    public abstract double calculateInterest();

    /**
     * Display account information
     */
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + String.format("%.2f", balance));
    }
}
