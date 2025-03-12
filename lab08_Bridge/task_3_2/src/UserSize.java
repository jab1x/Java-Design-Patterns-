public class UserSize implements ButtonSize {
    private int width;
    private int height;

    public UserSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setSize() {
        System.out.printf("Setting custom size: %d x %d\n", width, height);
    }
}
