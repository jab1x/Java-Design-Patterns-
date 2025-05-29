public class TextEditor {

    private Document document;

    final private Button saveButton  = new Button();
    final private Button printButton = new Button();

    final private MenuItem saveMenuItem      = new MenuItem();
    final private MenuItem printMenuItem     = new MenuItem();
    final private MenuItem showInfoMenuItem  = new MenuItem();

    final private Shortcut saveShortcut   = new Shortcut();
    final private Shortcut printShortcut  = new Shortcut();

    public TextEditor() {
        saveButton.setCommand(new SaveCommand(this));
        printButton.setCommand(new PrintCommand(this));

        saveMenuItem.setCommand(new SaveCommand(this));
        printMenuItem.setCommand(new PrintCommand(this));
        showInfoMenuItem.setCommand(new ShowInfoCommand(this));

        saveShortcut.setCommand(new SaveCommand(this));
        printShortcut.setCommand(new PrintCommand(this));
    }

    public void newDocument(String name) {
        document = new Document(name);
    }

    public void saveDocument() {
        if (document != null) {
            document.save();
        } else {
            System.out.println("No document to save");
        }
    }

    public void printDocument() {
        if (document != null) {
            document.print();
        } else {
            System.out.println("No document to print");
        }
    }

    public void showDocumentInfo() {
        if (document != null) {
            document.showInfo();
        } else {
            System.out.println("No document to show info");
        }
    }

    public void clickSaveButton()       { saveButton.click(); }
    public void clickPrintButton()      { printButton.click(); }
    public void selectSaveMenuItem()    { saveMenuItem.select(); }
    public void selectPrintMenuItem()   { printMenuItem.select(); }
    public void selectShowInfoMenuItem(){ showInfoMenuItem.select(); }
    public void pressSaveShortcut()     { saveShortcut.press(); }
    public void pressPrintShortcut()    { printShortcut.press(); }
}
