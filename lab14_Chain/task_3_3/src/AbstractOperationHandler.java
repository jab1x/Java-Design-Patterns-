
public abstract class AbstractOperationHandler implements OperationHandler {
    private OperationHandler next;

    @Override
    public void setNext(OperationHandler next) {
        this.next = next;
    }

    @Override
    public void handle(OperationRequest request) {
        if (canHandle(request)) {
            doHandle(request);
        } else if (next != null) {
            next.handle(request);
        } else {
            System.out.println("No handler for: " + request.getType());
        }
    }

    protected abstract boolean canHandle(OperationRequest request);

    protected abstract void doHandle(OperationRequest request);
}
