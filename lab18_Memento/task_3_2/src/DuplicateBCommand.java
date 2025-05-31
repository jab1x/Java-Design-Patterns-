public class DuplicateBCommand implements Command {
    private final Triangle triangle;
    public DuplicateBCommand(Triangle triangle) {
        this.triangle = triangle;
    }
    @Override
    public void execute() {
        triangle.duplicateB();
    }
}
