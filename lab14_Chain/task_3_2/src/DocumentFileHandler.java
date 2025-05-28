
public class DocumentFileHandler extends AbstractFileHandler {
    @Override
    protected boolean canHandle(String fileName) {
        return fileName.endsWith(".doc") || fileName.endsWith(".docx");
    }
    @Override
    protected void doOpen(String fileName) {
        System.out.println("Opening document “" + fileName + "” with Word Processor");
    }
}
