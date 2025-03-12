public class TeeWithMilk extends Tee {
    private final int milkVolume;

    public TeeWithMilk(int sugar, int milkVolume, ServingType servingType) {
        super(sugar, servingType);
        this.milkVolume = milkVolume;
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.printf("Adding milk: %s ml...%n", milkVolume);
        if (sugar > 0) System.out.printf("Adding sugar: %s pieces...%n", sugar);
    }

    @Override
    public int cost() {
        return super.cost() + (int) (milkVolume / 20.0);
    }
}
