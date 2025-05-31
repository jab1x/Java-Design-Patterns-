public class HalfACommand implements Command {
    private final Triangle triangle;
    public HalfACommand(Triangle triangle) {
        this.triangle = triangle;
    }
    @Override
    public void execute() {
        triangle.halfA();
    }
}
