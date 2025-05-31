public class BankAccountPayment implements PaymentStrategy {

    private final String bankAccountNumber;

    public BankAccountPayment(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(
            "Payment of $" + amount +
            " made from bank account #" + bankAccountNumber + "."
        );
    }
}
