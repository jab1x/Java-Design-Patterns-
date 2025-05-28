public class PdfFileHandler extends AbstractFileHandler {
    @Override
    protected boolean canHandle(String fileName) {
        return fileName.endsWith(".pdf");
    }
    @Override
    protected void doOpen(String fileName) {
        System.out.println("Opening PDF “" + fileName + "” with PDF Reader");
    }
}
