public class DeLonghi extends CoffeeMachine {
    public DeLonghi() {
        super("DeLonghi", 20000, 500, 10, 50);
    }

    @Override
    public void displayInfo(int days, int cupsPerDay) {
        System.out.println("DeLonghi: Прибуток за " + days + " днів: " + calculateProfit(days, cupsPerDay));
    }
}
