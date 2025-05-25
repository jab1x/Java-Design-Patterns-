public class SugarDecorator extends BeverageDecorator {
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + ", Sugar";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
