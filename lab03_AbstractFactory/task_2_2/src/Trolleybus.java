class Trolleybus extends Transport {
    public Trolleybus(String manufacturer, int cost, int operationCost) {
        super(manufacturer, cost, operationCost);
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Тролейбус: " + manufacturer + ", Вартість: " + cost + ", Витрати на км: " + operationCost);
    }
}
