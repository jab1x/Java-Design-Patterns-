public class PresentationFileHandler extends AbstractFileHandler {
    @Override
    protected boolean canHandle(String fileName) {
        return fileName.endsWith(".pptx");
    }
    @Override
    protected void doOpen(String fileName) {
        System.out.println("Opening presentation “" + fileName + "” with Presentation Viewer");
    }
}
