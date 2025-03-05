abstract class CoffeeMachine {
    protected String manufacturer;
    protected int machineCost;
    protected int maintenanceCost;
    protected int coffeeCost;
    protected int coffeePrice;

    public CoffeeMachine(String manufacturer, int machineCost, int maintenanceCost, int coffeeCost, int coffeePrice) {
        this.manufacturer = manufacturer;
        this.machineCost = machineCost;
        this.maintenanceCost = maintenanceCost;
        this.coffeeCost = coffeeCost;
        this.coffeePrice = coffeePrice;
    }

    public int calculateProfit(int days, int cupsPerDay) {
        int totalRevenue = days * cupsPerDay * coffeePrice;
        int totalCost = machineCost + (days * maintenanceCost) + (days * cupsPerDay * coffeeCost);
        return totalRevenue - totalCost;
    }

    public abstract void displayInfo(int days, int cupsPerDay);
}
