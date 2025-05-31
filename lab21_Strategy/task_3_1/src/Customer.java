public class Customer {

    
    private PaymentStrategy paymentStrategy;

    public Customer(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(int amount) {
        if (paymentStrategy == null) {
            System.out.println("No payment method selected!");
            return;
        }
        paymentStrategy.pay(amount);
    }
}
