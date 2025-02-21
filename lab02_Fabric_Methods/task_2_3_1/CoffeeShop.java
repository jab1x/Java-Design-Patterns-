class CoffeeShop {
    private double totalProfit = 0;

    public void sellCoffee(String coffeeType, int quantity) {
        Coffee coffee = CoffeeFactory.createCoffee(coffeeType);
        double profit = (coffee.getSalePrice() - coffee.getCostPrice()) * quantity;
        totalProfit += profit;
        System.out.println("Продано " + quantity + " x " + coffee.getName() + ". Прибуток: " + profit + " грн");
    }

    public void showTotalProfit() {
        System.out.println("Загальний прибуток кав’ярні: " + totalProfit + " грн");
    }
}
