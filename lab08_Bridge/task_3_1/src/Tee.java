public class Tee extends Beverage {
    public Tee(int sugar, ServingType servingType) {
        super(sugar, servingType);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing tea...");
    }

    @Override
    public void drink() {
        System.out.println("Drinking tea...");
    }

    @Override
    public int cost() {
        return 7;
    }
}

