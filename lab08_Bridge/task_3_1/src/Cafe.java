public class Cafe {
    public static void main(String[] args) {
        System.out.println("=== Welcome to Our Cafe! ===\n");

        // напої які подаються в ресторані
        Beverage blackCoffee = new BlackCoffee(2, 250, true, new RestaurantServing());
        Beverage coffeeWithMilk = new CoffeeWithMilk(2, 200, new RestaurantServing());
        Beverage blackTea = new BlackTee(1, 300, new RestaurantServing());
        Beverage teaWithMilk = new TeeWithMilk(2, 250, new RestaurantServing());
        Beverage blackChocolate = new BlackChocolate(3, 200, new RestaurantServing());
        Beverage milkChocolate = new MilkChocolate(3, 200, new RestaurantServing());

        // напої на винос
        Beverage blackCoffeeToGo = new BlackCoffee(2, 250, true, new TakeawayServing());
        Beverage coffeeWithMilkToGo = new CoffeeWithMilk(2, 200, new TakeawayServing());
        Beverage blackTeaToGo = new BlackTee(1, 300, new TakeawayServing());
        Beverage teaWithMilkToGo = new TeeWithMilk(2, 250, new TakeawayServing());
        Beverage blackChocolateToGo = new BlackChocolate(3, 200, new TakeawayServing());
        Beverage milkChocolateToGo = new MilkChocolate(3, 200, new TakeawayServing());

        // усі напої
        Beverage[] beverages = {
            blackCoffee, coffeeWithMilk, blackTea, teaWithMilk, blackChocolate, milkChocolate,
            blackCoffeeToGo, coffeeWithMilkToGo, blackTeaToGo, teaWithMilkToGo, blackChocolateToGo, milkChocolateToGo
        };

        // обробка кожного напою
        for (Beverage beverage : beverages) {
            serveBeverage(beverage);
        }
    }

    private static void serveBeverage(Beverage beverage) {
        System.out.println("\n=========================");
        beverage.prepare();
        beverage.serve();
        System.out.printf("Cost of beverage: %s UAH%n", beverage.cost());
        beverage.drink();
    }
}
