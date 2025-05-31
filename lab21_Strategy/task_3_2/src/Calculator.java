public class Calculator {

    
    private OperationStrategy strategy;


    public void setStrategy(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    
    public int calculate(int a, int b) {
        if (strategy == null) {
            throw new IllegalStateException("Operation strategy not set");
        }
        return strategy.execute(a, b);
    }
}
