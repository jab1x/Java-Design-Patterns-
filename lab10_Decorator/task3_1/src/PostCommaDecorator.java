public class PostCommaDecorator extends StringDecorator {
    public PostCommaDecorator(IPrintable component) {
        super(component);
    }

    @Override
    public void print() {
        component.print();
        System.out.print(",");
    }
}
