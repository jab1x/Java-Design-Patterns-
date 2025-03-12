public abstract class Button {
    protected ButtonSize size;

    public Button(ButtonSize size) {
        this.size = size;
    }

    abstract void draw();
}
