/**
 * Interface demonstrating Polymorphism in OOP
 * PaymentMethod defines a contract that all payment types must follow
 * This allows different payment implementations to be used interchangeably
 *
 * Note: We could use an abstract class instead, but interface is preferred
 * when we only need to define method signatures without any implementation
 */
public interface PaymentMethod {
    /**
     * Process a payment of the given amount
     * Each implementing class will provide its own specific implementation
     *
     * @param amount The amount to be paid
     */
    void pay(double amount);

    /**
     * Get the payment method name
     * @return String representation of the payment method
     */
    String getPaymentMethodName();
}
