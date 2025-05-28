public class Client {
    public static void main(String[] args) {
        FileHandler imageHandler     = new ImageFileHandler();
        FileHandler docHandler       = new DocumentFileHandler();
        FileHandler excelHandler     = new ExcelFileHandler();
        FileHandler presentationHandler = new PresentationFileHandler();
        FileHandler pdfHandler       = new PdfFileHandler();

        imageHandler.setNext(docHandler);
        docHandler.setNext(excelHandler);
        excelHandler.setNext(presentationHandler);
        presentationHandler.setNext(pdfHandler);

        String[] files = {
            "image.jpg",
            "image.png",
            "document.docx",
            "document.doc",
            "table.xls",
            "table.xlsx",
            "presentation.pptx",
            "document.pdf",
            "unknown.xyz"
        };

        for (String file : files) {
            imageHandler.open(file);
        }
    }
}
