public class NextChannelCommand implements Command {
    private final Device device;
    public NextChannelCommand(Device device) {
        this.device = device;
    }
    @Override
    public void execute() {
        device.nextChanel();
    }
}
