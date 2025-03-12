public abstract class Beverage {
    protected final int sugar;
    protected ServingType servingType;

    public Beverage(int sugar, ServingType servingType) {
        this.sugar = sugar;
        this.servingType = servingType;
    }

    public abstract void prepare();
    public abstract void drink();
    public abstract int cost();

    public void serve() {
        servingType.serve();
    }
}
