public class DuplicateACommand implements Command {
    private final Triangle triangle;
    public DuplicateACommand(Triangle triangle) {
        this.triangle = triangle;
    }
    @Override
    public void execute() {
        triangle.duplicateA();
    }
}
