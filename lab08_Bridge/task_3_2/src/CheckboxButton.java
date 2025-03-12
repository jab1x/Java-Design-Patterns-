public class CheckboxButton extends Button {
    public CheckboxButton(ButtonSize size) {
        super(size);
    }

    public void draw() {
        size.setSize();
        System.out.println("Drawing a checkbox button.\n");
    }
}
