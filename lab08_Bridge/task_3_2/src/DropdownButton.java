public class DropdownButton extends Button {
    public DropdownButton(ButtonSize size) {
        super(size);
    }

    public void draw() {
        size.setSize();
        System.out.println("Drawing a dropdown button.\n");
    }
}
