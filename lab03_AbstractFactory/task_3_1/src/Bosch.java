class Bosch extends CoffeeMachine {
    public Bosch() {
        super("Bosch", 22000, 550, 11, 52);
    }

    @Override
    public void displayInfo(int days, int cupsPerDay) {
        System.out.println("Bosch: Прибуток за " + days + " днів: " + calculateProfit(days, cupsPerDay));
    }
}
