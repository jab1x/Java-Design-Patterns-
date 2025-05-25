public class PostExclaimDecorator extends StringDecorator {
    public PostExclaimDecorator(IPrintable component) {
        super(component);
    }

    @Override
    public void print() {
        component.print();
        System.out.print("!");
    }
}
