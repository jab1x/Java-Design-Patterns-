class Philips extends CoffeeMachine {
    public Philips() {
        super("Philips", 25000, 600, 12, 55);
    }

    @Override
    public void displayInfo(int days, int cupsPerDay) {
        System.out.println("Philips: Прибуток за " + days + " днів: " + calculateProfit(days, cupsPerDay));
    }
}
