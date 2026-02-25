/**
 * Main class to demonstrate Polymorphism in Java
 *
 * Key Concepts:
 * 1. Polymorphism means "many forms" - same interface, different implementations
 * 2. Runtime Polymorphism (Dynamic Method Dispatch):
 *    - The method that gets executed is determined at runtime
 *    - Based on the actual object type, not the reference type
 * 3. Benefits:
 *    - Code flexibility and extensibility
 *    - Easy to add new payment methods without changing existing code
 *    - Loose coupling between classes
 *
 * Real-world analogy:
 * Just like you can pay with different methods (card, cash, PayPal),
 * the ShoppingCart doesn't care HOW you pay, just that you CAN pay.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("  OOP PRINCIPLE: POLYMORPHISM");
        System.out.println("  Task: Payment Gateway System");
        System.out.println("===========================================");

        // Create payment method objects
        CreditCard creditCard = new CreditCard("1234567812345678", "John Doe");
        PayPal paypal = new PayPal("john.doe@email.com");

        // Scenario 1: Customer pays with Credit Card
        System.out.println("\n\n========== SCENARIO 1 ==========");
        ShoppingCart cart1 = new ShoppingCart(149.99);
        cart1.checkout(creditCard); // Polymorphism in action!

        // Scenario 2: Customer pays with PayPal
        System.out.println("\n\n========== SCENARIO 2 ==========");
        ShoppingCart cart2 = new ShoppingCart(89.50);
        cart2.checkout(paypal); // Same method, different behavior!

        // Scenario 3: Demonstrating polymorphic array
        System.out.println("\n\n========== SCENARIO 3: POLYMORPHIC ARRAY ==========");
        System.out.println("Processing multiple payments with different methods:\n");

        // Array of PaymentMethod interface type
        // Can hold ANY object that implements PaymentMethod
        PaymentMethod[] paymentMethods = {creditCard, paypal};
        double[] amounts = {299.99, 199.99};

        for (int i = 0; i < paymentMethods.length; i++) {
            ShoppingCart cart = new ShoppingCart(amounts[i]);
            cart.checkout(paymentMethods[i]);
            System.out.println(); // Blank line for readability
        }

        // Demonstrating the power of polymorphism
        System.out.println("\n===========================================");
        System.out.println("  POLYMORPHISM IN ACTION");
        System.out.println("===========================================");
        System.out.println("Notice how:");
        System.out.println("1. ShoppingCart.checkout() works with ANY");
        System.out.println("   payment method");
        System.out.println("2. Each payment method has different");
        System.out.println("   behavior (swiping vs redirecting)");
        System.out.println("3. We can add new payment methods (Bitcoin,");
        System.out.println("   ApplePay) without changing ShoppingCart");
        System.out.println("4. The actual method executed is determined");
        System.out.println("   at RUNTIME based on the object type");
        System.out.println("===========================================");

        // Key Takeaway Example
        System.out.println("\nKey Takeaway:");
        demonstratePolymorphism(creditCard);
        demonstratePolymorphism(paypal);
    }

    /**
     * This method accepts ANY PaymentMethod implementation
     * This is the essence of polymorphism - writing code that works
     * with the interface/superclass, not specific implementations
     */
    private static void demonstratePolymorphism(PaymentMethod method) {
        System.out.println("  -> Can process payment with: " + method.getPaymentMethodName());
    }
}
