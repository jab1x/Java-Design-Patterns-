public class CoffeeShopSimulation {
    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop();

        shop.sellCoffee("espresso", 10);
        shop.sellCoffee("latte", 5);
        shop.sellCoffee("americano", 8);
        shop.sellCoffee("cappuccino", 6);

        shop.showTotalProfit();
    }
}
