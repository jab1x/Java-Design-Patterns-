public class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
