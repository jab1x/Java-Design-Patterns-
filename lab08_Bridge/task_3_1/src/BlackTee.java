public class BlackTee extends Tee {
    private final int waterVolume;

    public BlackTee(int sugar, int waterVolume, ServingType servingType) {
        super(sugar, servingType);
        this.waterVolume = waterVolume;
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.printf("Adding hot water: %s ml...%n", waterVolume);
        if (sugar > 0) System.out.printf("Adding sugar: %s pieces...%n", sugar);
    }

    @Override
    public int cost() {
        return super.cost();
    }
}
