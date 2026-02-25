/**
 * ShoppingCart class demonstrates Polymorphism
 * It can process payments using ANY class that implements PaymentMethod
 * This is the power of polymorphism - treating different objects uniformly
 */
public class ShoppingCart {
    private double totalAmount;

    /**
     * Constructor for ShoppingCart
     * @param totalAmount Total amount of items in cart
     */
    public ShoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Process payment using any PaymentMethod
     * This method demonstrates RUNTIME POLYMORPHISM
     *
     * The actual payment behavior depends on which object is passed:
     * - If CreditCard is passed, it will swipe the card
     * - If PayPal is passed, it will redirect to PayPal
     * - If a new payment method is added later, this code doesn't need to change!
     *
     * @param paymentMethod Any object that implements PaymentMethod interface
     */
    public void checkout(PaymentMethod paymentMethod) {
        System.out.println("\n===========================================");
        System.out.println("  Processing Checkout");
        System.out.println("===========================================");
        System.out.println("Cart Total: $" + String.format("%.2f", totalAmount));
        System.out.println("Selected Payment Method: " + paymentMethod.getPaymentMethodName());

        // The actual method called depends on the runtime type of paymentMethod
        // This is DYNAMIC METHOD DISPATCH (runtime polymorphism)
        paymentMethod.pay(totalAmount);

        System.out.println("\n*** Order Confirmed! ***");
        System.out.println("Thank you for your purchase!");
    }

    /**
     * Get total amount
     * @return Total amount in cart
     */
    public double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Add item to cart
     * @param price Price of the item to add
     */
    public void addItem(double price) {
        this.totalAmount += price;
        System.out.println("Item added. New total: $" + String.format("%.2f", totalAmount));
    }
}
