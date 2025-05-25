public class PostWordDecorator extends StringDecorator {
    private final String word;

    public PostWordDecorator(IPrintable component, String word) {
        super(component);
        this.word = word;
    }

    @Override
    public void print() {
        component.print();
        System.out.print(word);
    }
}
