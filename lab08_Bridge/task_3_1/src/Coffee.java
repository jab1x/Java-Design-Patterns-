public class Coffee extends Beverage {
    public Coffee(int sugar, ServingType servingType) {
        super(sugar, servingType);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing coffee...");
    }

    @Override
    public void drink() {
        System.out.println("Drinking coffee...");
    }

    @Override
    public int cost() {
        return 10;
    }
}

