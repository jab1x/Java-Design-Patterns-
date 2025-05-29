public class TurnOnCommand implements Command {
    private final Lamp lamp;
    public TurnOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }
    @Override
    public void execute() {
        lamp.lightOn();
    }
}
