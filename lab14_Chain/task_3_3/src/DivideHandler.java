
public class DivideHandler extends AbstractOperationHandler {
    @Override
    protected boolean canHandle(OperationRequest req) {
        return req.getType() == OperationType.DIVIDE;
    }
    @Override
    protected void doHandle(OperationRequest req) {
        if (req.getB() == 0) {
            System.out.println("Error: Division by zero");
        } else {
            double res = req.getA() / req.getB();
            System.out.printf("%.2f / %.2f = %.2f%n", req.getA(), req.getB(), res);
        }
    }
}
