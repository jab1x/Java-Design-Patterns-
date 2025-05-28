public class ExcelFileHandler extends AbstractFileHandler {
    @Override
    protected boolean canHandle(String fileName) {
        return fileName.endsWith(".xls") || fileName.endsWith(".xlsx");
    }
    @Override
    protected void doOpen(String fileName) {
        System.out.println("Opening spreadsheet “" + fileName + "” with Spreadsheet App");
    }
}
