public class LowState implements State {
    public static final LowState INSTANCE = new LowState();
    private LowState() { }

    @Override
    public void turnUp(Fan fan) {
        fan.setState(MediumState.INSTANCE);
        System.out.println("Fan is on medium");
    }

    @Override
    public void turnDown(Fan fan) {
    }

    @Override
    public String getName() {
        return "low";
    }
}
