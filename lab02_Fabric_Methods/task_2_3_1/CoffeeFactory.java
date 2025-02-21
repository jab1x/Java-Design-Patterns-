class CoffeeFactory {
    public static Coffee createCoffee(String type) {
        return switch (type.toLowerCase()) {
            case "espresso" -> new Espresso();
            case "americano" -> new Americano();
            case "cappuccino" -> new Cappuccino();
            case "latte" -> new Latte();
            default -> throw new IllegalArgumentException("Невідомий напій: " + type);
        };
    }
}
