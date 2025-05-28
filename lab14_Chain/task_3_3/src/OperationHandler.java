public interface OperationHandler {
    void setNext(OperationHandler next);
    void handle(OperationRequest request);
}
