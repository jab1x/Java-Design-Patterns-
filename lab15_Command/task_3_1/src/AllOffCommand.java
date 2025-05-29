import java.util.List;

public class AllOffCommand implements Command {
    private final List<Lamp> lamps;
    public AllOffCommand(List<Lamp> lamps) {
        this.lamps = lamps;
    }
    @Override
    public void execute() {
        lamps.forEach(Lamp::lightOff);
    }
}
