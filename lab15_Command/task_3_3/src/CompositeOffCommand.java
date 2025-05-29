import java.util.List;

public class CompositeOffCommand implements Command {
    private final List<Command> commands;
    public CompositeOffCommand(List<Command> commands) {
        this.commands = commands;
    }
    @Override
    public void execute() {
        for (Command cmd : commands) {
            cmd.execute();
        }
    }
}
