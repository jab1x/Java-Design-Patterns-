
public abstract class AbstractFileHandler implements FileHandler {
    private FileHandler next;

    @Override
    public void setNext(FileHandler next) {
        this.next = next;
    }

    @Override
    public void open(String fileName) {
        if (canHandle(fileName)) {
            doOpen(fileName);
        } else if (next != null) {
            next.open(fileName);
        } else {
            System.out.println("No handler for: " + fileName);
        }
    }

    protected abstract boolean canHandle(String fileName);
    protected abstract void doOpen(String fileName);
}
