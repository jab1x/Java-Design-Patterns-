public class WhippedCreamDecorator extends BeverageDecorator {
    public WhippedCreamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + ", Whipped Cream";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.40;
    }
}
