public class SetACommand implements Command {
    private final Triangle triangle;
    private final float newValue;
    public SetACommand(Triangle triangle, float newValue) {
        this.triangle = triangle;
        this.newValue = newValue;
    }
    @Override
    public void execute() {
        triangle.setA(newValue);
    }
}
