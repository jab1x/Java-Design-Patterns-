public class Client {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setStrategy(new SubtractOperation());
        calculator.calculate(12, 13);

        calculator.setStrategy(new AddOperation());
        calculator.calculate(5, 7);

        calculator.setStrategy(new MultiplyOperation());
        calculator.calculate(3, 4);
    }
}
