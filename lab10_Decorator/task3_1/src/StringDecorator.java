public abstract class StringDecorator implements IPrintable {
    protected final IPrintable component;

    public StringDecorator(IPrintable component) {
        this.component = component;
    }
}
