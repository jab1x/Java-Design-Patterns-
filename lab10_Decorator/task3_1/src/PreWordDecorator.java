public class PreWordDecorator extends StringDecorator {
    private final String word;

    public PreWordDecorator(IPrintable component, String word) {
        super(component);
        this.word = word;
    }

    @Override
    public void print() {
        System.out.print(word);
        component.print();
    }
}
