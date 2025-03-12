public class ImageButton extends Button {
    public ImageButton(ButtonSize size) {
        super(size);
    }

    public void draw() {
        size.setSize();
        System.out.println("Drawing an image button.\n");
    }
}
