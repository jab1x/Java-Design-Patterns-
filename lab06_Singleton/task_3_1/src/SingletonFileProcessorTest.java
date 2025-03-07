public class SingletonFileProcessorTest {
    public static void main(String[] args) {
        FileProcessor processor = FileProcessor.getInstance();
        processor.processFile("example.txt");
    }
}
