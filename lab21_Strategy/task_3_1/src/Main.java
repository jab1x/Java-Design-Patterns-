public class Main {

    public static void main(String[] args) {
        PaymentStrategy bankStrategy = new BankAccountPayment("UA123456789");
        Customer customer = new Customer(bankStrategy);

        customer.pay(100);  

        PaymentStrategy paypalStrategy = new PayPalPayment("user@example.com");
        customer.setPaymentStrategy(paypalStrategy);

        customer.pay(250);  

        
    }
}
