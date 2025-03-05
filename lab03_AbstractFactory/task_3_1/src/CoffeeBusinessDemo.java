public class CoffeeBusinessDemo { // демонстрація роботи
    public static void main(String[] args) {
        int days = 30; // місяць
        int cupsPerDay = 50;

        CoffeeMachineFactory factory = new DeLonghiFactory(); // можна іншу фабрику вибрати
        CoffeeMachine machine = factory.createCoffeeMachine();
        machine.displayInfo(days, cupsPerDay);
    }
}
