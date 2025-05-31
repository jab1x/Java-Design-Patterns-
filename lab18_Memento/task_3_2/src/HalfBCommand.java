public class HalfBCommand implements Command {
    private final Triangle triangle;
    public HalfBCommand(Triangle triangle) {
        this.triangle = triangle;
    }
    @Override
    public void execute() {
        triangle.halfB();
    }
}
