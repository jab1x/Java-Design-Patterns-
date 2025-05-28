
public class OperationRequest {
    private final double a;
    private final double b;
    private final OperationType type;

    public OperationRequest(double a, double b, OperationType type) {
        this.a = a;
        this.b = b;
        this.type = type;
    }

    public double getA()         { return a; }
    public double getB()         { return b; }
    public OperationType getType() { return type; }
}
