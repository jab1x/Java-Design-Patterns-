public class RadioButton extends Button {
    public RadioButton(ButtonSize size) {
        super(size);
    }

    public void draw() {
        size.setSize();
        System.out.println("Drawing a radio button.\n");
    }
}
