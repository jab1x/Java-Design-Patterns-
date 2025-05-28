public class ImageGallery {

    public static void main(String[] args) {
        String path = "task_3_1/resources/";

        DisplayObject[] images = {
            new ImageProxy(path + "image1.jpeg"),
            new ImageProxy(path + "image2.jpeg"),
            new ImageProxy(path + "image3.jpeg"),
            new ImageProxy(path + "image4.jpeg"),
            new ImageProxy(path + "image5.jpeg"),
            new ImageProxy(path + "image6.jpeg"),
            new ImageProxy(path + "image7.jpeg"),
            new ImageProxy(path + "image8.jpeg"),
            new ImageProxy(path + "image9.jpeg"),
            new ImageProxy(path + "image10.jpeg"),
        };

        for (DisplayObject img : images) {
            img.display();  // тільки тут відбудеться load() для кожної картинки
        }
    }
}

