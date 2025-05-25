public class Main {
    public static void main(String[] args) {
        IPrintable p = new PrintableString("");

        p = new PreWordDecorator(p, "Hello");
        
        p = new PostCommaDecorator(p);

        p = new PostSpaceDecorator(p);

        p = new PostWordDecorator(p, "World");

        p = new PostExclaimDecorator(p);

        p = new PostEndlDecorator(p);

        p.print();  // → Hello, World!
    }
}
