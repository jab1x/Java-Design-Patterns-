class Bus extends Transport {
    public Bus(String manufacturer, int cost, int operationCost) {
        super(manufacturer, cost, operationCost);
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Автобус: " + manufacturer + ", Вартість: " + cost + ", Витрати на км: " + operationCost);
    }
}
