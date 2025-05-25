public class PostSpaceDecorator extends StringDecorator {
    public PostSpaceDecorator(IPrintable component) {
        super(component);
    }

    @Override
    public void print() {
        component.print();
        System.out.print(" ");
    }
}
