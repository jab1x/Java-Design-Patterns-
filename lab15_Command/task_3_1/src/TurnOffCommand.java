public class TurnOffCommand implements Command {
    private final Lamp lamp;
    public TurnOffCommand(Lamp lamp) {
        this.lamp = lamp;
    }
    @Override
    public void execute() {
        lamp.lightOff();
    }
}
