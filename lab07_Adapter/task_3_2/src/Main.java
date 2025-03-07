public class Main {
    public static void main(String[] args) {
        VehicleCalculator carCalculator = new CarCalculator();
        Customs customs = new VehicleCalculatorAdapter(carCalculator);
        
        Auto auto = new Auto(5, "Toyota", false, 80000);
        System.out.println("Вартість авто (грн): " + customs.vehiclePrice(auto));
        System.out.println("Мито (грн): " + customs.tax(auto));
    }
}
