package strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Paying with PayPal
        cart.setPaymentStrategy(new PayPalPayment("myemail@example.com", "mypwd"));
        cart.checkout(100);

        // Changing payment method to credit card
        cart.setPaymentStrategy(new CreditCardPayment("John Doe", "123456789"));
        cart.checkout(200);
    }
}
