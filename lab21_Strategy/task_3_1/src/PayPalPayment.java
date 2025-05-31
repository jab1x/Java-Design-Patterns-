public class PayPalPayment implements PaymentStrategy {

    private final String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println(
            "Payment of $" + amount +
            " made from PayPal account: " + email + "."
        );
    }
}
