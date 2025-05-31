public class SetBCommand implements Command {
    private final Triangle triangle;
    private final float newValue;
    public SetBCommand(Triangle triangle, float newValue) {
        this.triangle = triangle;
        this.newValue = newValue;
    }
    @Override
    public void execute() {
        triangle.setB(newValue);
    }
}
