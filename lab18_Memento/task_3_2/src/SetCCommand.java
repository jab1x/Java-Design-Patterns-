public class SetCCommand implements Command {
    private final Triangle triangle;
    private final float newValue;
    public SetCCommand(Triangle triangle, float newValue) {
        this.triangle = triangle;
        this.newValue = newValue;
    }
    @Override
    public void execute() {
        triangle.setC(newValue);
    }
}
