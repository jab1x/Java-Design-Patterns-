public abstract class Creator {
    abstract Product createProduct();
    
    public void someOperation() {
        Product p = createProduct();
        p.doSomething();
    }
}
