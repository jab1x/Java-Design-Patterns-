public class DuplicateCCommand implements Command {
    private final Triangle triangle;
    public DuplicateCCommand(Triangle triangle) {
        this.triangle = triangle;
    }
    @Override
    public void execute() {
        triangle.duplicateC();
    }
}
