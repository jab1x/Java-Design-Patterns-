public class BlackCoffee extends Coffee {
    private final int waterVolume;
    private final boolean extraCoffee;

    public BlackCoffee(int sugar, int waterVolume, boolean extraCoffee, ServingType servingType) {
        super(sugar, servingType);
        this.waterVolume = waterVolume;
        this.extraCoffee = extraCoffee;
    }

    @Override
    public void prepare() {
        super.prepare();
        if (extraCoffee) System.out.println("Adding extra coffee...");
        System.out.printf("Adding hot water: %s ml...%n", waterVolume);
        if (sugar > 0) System.out.printf("Adding sugar: %s pieces...%n", sugar);
    }

    @Override
    public int cost() {
        return super.cost() + (extraCoffee ? 3 : 0);
    }
}

