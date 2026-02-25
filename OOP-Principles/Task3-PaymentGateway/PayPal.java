/**
 * PayPal class implements PaymentMethod interface
 * Demonstrates polymorphism by providing PayPal specific payment logic
 */
public class PayPal implements PaymentMethod {
    private String email;

    /**
     * Constructor for PayPal
     * @param email The email address associated with PayPal account
     */
    public PayPal(String email) {
        this.email = email;
    }

    /**
     * Implementation of pay() method for PayPal payment
     * Shows specific behavior for PayPal transactions
     *
     * @param amount The amount to be paid
     */
    @Override
    public void pay(double amount) {
        System.out.println("\n--- PayPal Payment ---");
        System.out.println("Redirecting to PayPal...");
        System.out.println("PayPal Account: " + email);
        System.out.println("Amount: $" + String.format("%.2f", amount));
        System.out.println("Authenticating with PayPal...");
        System.out.println("Payment Successful!");
        System.out.println("Receipt sent to " + email);
    }

    /**
     * Get payment method name
     * @return Payment method name
     */
    @Override
    public String getPaymentMethodName() {
        return "PayPal";
    }

    // Getter
    public String getEmail() {
        return email;
    }
}
