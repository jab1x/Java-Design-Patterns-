
public class SubtractHandler extends AbstractOperationHandler {
    @Override
    protected boolean canHandle(OperationRequest req) {
        return req.getType() == OperationType.SUBTRACT;
    }
    @Override
    protected void doHandle(OperationRequest req) {
        double res = req.getA() - req.getB();
        System.out.printf("%.2f - %.2f = %.2f%n", req.getA(), req.getB(), res);
    }
}
