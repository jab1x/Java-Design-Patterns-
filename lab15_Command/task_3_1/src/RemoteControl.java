// Invoker
public class RemoteControl {
    private Command onCommand;
    private Command offCommand;

    public void setCommands(Command onCommand, Command offCommand) {
        this.onCommand  = onCommand;
        this.offCommand = offCommand;
    }

    public void pressOn() {
        if (onCommand != null) onCommand.execute();
    }
    public void pressOff() {
        if (offCommand != null) offCommand.execute();
    }
}
