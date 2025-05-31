public class HalfCCommand implements Command {
    private final Triangle triangle;
    public HalfCCommand(Triangle triangle) {
        this.triangle = triangle;
    }
    @Override
    public void execute() {
        triangle.halfC();
    }
}
