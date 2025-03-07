public class StringBuilderCustom {
    private StringBuilder builder;

    public StringBuilderCustom() {
        this.builder = new StringBuilder();
    }

    public StringBuilderCustom append(String sequence) {
        builder.append(sequence);
        return this;
    }

    public StringBuilderCustom insert(int position, String sequence) {
        if (position < 0 || position > builder.length()) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        builder.insert(position, sequence);
        return this;
    }

    public String build() {
        return builder.toString();
    }
}
