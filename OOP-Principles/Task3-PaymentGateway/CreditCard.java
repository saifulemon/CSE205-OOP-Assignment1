/**
 * CreditCard class implements PaymentMethod interface
 * Demonstrates polymorphism by providing credit card specific payment logic
 */
public class CreditCard implements PaymentMethod {
    private String cardNumber;
    private String cardHolderName;

    /**
     * Constructor for CreditCard
     * @param cardNumber The credit card number
     * @param cardHolderName Name on the card
     */
    public CreditCard(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    /**
     * Implementation of pay() method for credit card payment
     * Shows specific behavior for credit card transactions
     *
     * @param amount The amount to be charged
     */
    @Override
    public void pay(double amount) {
        System.out.println("\n--- Credit Card Payment ---");
        System.out.println("Swiping card...");
        System.out.println("Card Number: **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Amount Charged: $" + String.format("%.2f", amount));
        System.out.println("Payment Successful!");
        System.out.println("Processing through bank network...");
    }

    /**
     * Get payment method name
     * @return Payment method name
     */
    @Override
    public String getPaymentMethodName() {
        return "Credit Card";
    }

    // Getters
    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }
}
