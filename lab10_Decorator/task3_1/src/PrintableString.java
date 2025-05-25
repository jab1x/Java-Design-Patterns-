public class PrintableString implements IPrintable {
    private final String str;

    public PrintableString(String str) {
        this.str = str;
    }

    @Override
    public void print() {
        System.out.print(str);
    }
}
