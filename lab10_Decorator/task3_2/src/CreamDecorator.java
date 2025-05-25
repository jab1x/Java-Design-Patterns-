public class CreamDecorator extends BeverageDecorator {
    public CreamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + ", Cream";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.30;
    }
}
