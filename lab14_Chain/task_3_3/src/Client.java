
public class Client {
    public static void main(String[] args) {
        OperationHandler add      = new AddHandler();
        OperationHandler sub      = new SubtractHandler();
        OperationHandler mul      = new MultiplyHandler();
        OperationHandler div      = new DivideHandler();

        add.setNext(sub);
        sub.setNext(mul);
        mul.setNext(div);

        OperationRequest[] requests = {
            new OperationRequest( 5,  3, OperationType.ADD),
            new OperationRequest(10,  4, OperationType.SUBTRACT),
            new OperationRequest( 6,  7, OperationType.MULTIPLY),
            new OperationRequest(20,  4, OperationType.DIVIDE),
            new OperationRequest( 1,  0, OperationType.DIVIDE),
            new OperationRequest( 2,  2, null)  // незрозумілий тип
        };

        for (OperationRequest req : requests) {
            add.handle(req);
        }
    }
}
