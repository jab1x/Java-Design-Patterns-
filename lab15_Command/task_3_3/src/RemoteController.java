public class RemoteController {
    private Command onCommand;
    private Command offCommand;
    private Command volumeUpCommand;
    private Command volumeDownCommand;
    private Command nextChannelCommand;
    private Command prevChannelCommand;

    public void setOnCommand(Command onCommand) {
        this.onCommand = onCommand;
    }
    public void setOffCommand(Command offCommand) {
        this.offCommand = offCommand;
    }
    public void setVolumeUpCommand(Command volumeUpCommand) {
        this.volumeUpCommand = volumeUpCommand;
    }
    public void setVolumeDownCommand(Command volumeDownCommand) {
        this.volumeDownCommand = volumeDownCommand;
    }
    public void setNextChannelCommand(Command nextChannelCommand) {
        this.nextChannelCommand = nextChannelCommand;
    }
    public void setPrevChannelCommand(Command prevChannelCommand) {
        this.prevChannelCommand = prevChannelCommand;
    }

    public void deviceOn() {
        if (onCommand != null) onCommand.execute();
    }
    public void deviceOff() {
        if (offCommand != null) offCommand.execute();
    }
    public void deviceVolumeUp() {
        if (volumeUpCommand != null) volumeUpCommand.execute();
    }
    public void deviceVolumeDown() {
        if (volumeDownCommand != null) volumeDownCommand.execute();
    }
    public void deviceNextChanel() {
        if (nextChannelCommand != null) nextChannelCommand.execute();
    }
    public void devicePrevChanel() {
        if (prevChannelCommand != null) prevChannelCommand.execute();
    }
}
