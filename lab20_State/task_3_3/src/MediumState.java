public class MediumState implements State {
    public static final MediumState INSTANCE = new MediumState();
    private MediumState() { }

    @Override
    public void turnUp(Fan fan) {
        fan.setState(HighState.INSTANCE);
        System.out.println("Fan is on high");
    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(LowState.INSTANCE);
        System.out.println("Fan is on low");
    }

    @Override
    public String getName() {
        return "medium";
    }
}
