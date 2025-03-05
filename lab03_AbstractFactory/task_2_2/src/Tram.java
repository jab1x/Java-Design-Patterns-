class Tram extends Transport {
    public Tram(String manufacturer, int cost, int operationCost) {
        super(manufacturer, cost, operationCost);
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Трамвай: " + manufacturer + ", Вартість: " + cost + ", Витрати на км: " + operationCost);
    }
}
