public class PostEndlDecorator extends StringDecorator {
    public PostEndlDecorator(IPrintable component) {
        super(component);
    }

    @Override
    public void print() {
        component.print();
        System.out.println();
    }
}
