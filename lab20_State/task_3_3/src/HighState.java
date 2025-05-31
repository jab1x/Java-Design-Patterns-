public class HighState implements State {
    public static final HighState INSTANCE = new HighState();
    private HighState() { }

    @Override
    public void turnUp(Fan fan) {
    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(MediumState.INSTANCE);
        System.out.println("Fan is on medium");
    }

    @Override
    public String getName() {
        return "high";
    }
}
