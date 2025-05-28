public class ImageProxy implements DisplayObject {  // клас - замісник
    private final String path;
    private ImageFile realImage;    // реальний об’єкт завантажується тільки раз

    public ImageProxy(String path) {
        this.path = path;
    }

    @Override
    public void display() {
        if (realImage == null) {
            // перший раз — завантажуємо з диска
            realImage = new ImageFile(path);
        }
        // потім використовуємо вже завантажений
        realImage.display();
    }
}
