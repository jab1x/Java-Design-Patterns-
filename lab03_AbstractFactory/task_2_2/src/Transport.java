abstract class Transport {
    protected String manufacturer;
    protected int cost;
    protected int operationCost;
    
    public Transport(String manufacturer, int cost, int operationCost) {
        this.manufacturer = manufacturer;
        this.cost = cost;
        this.operationCost = operationCost;
    }
    
    public abstract void displayInfo();
}
