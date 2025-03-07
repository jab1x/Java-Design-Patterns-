public class VehicleCalculatorAdapter implements Customs {
    private VehicleCalculator calculator;
    private static final float USD_TO_UAH = 38.0f; 

    public VehicleCalculatorAdapter(VehicleCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public float vehiclePrice(Auto auto) {
        Vehicle vehicle = new Vehicle(auto.getModel(), auto.getAge(), auto.isDamaged() ? 1.0f : 0.0f, auto.getMileage());
        calculator.setVehicle(vehicle);
        float priceInUSD = Float.parseFloat(calculator.calculatePrice());
        return priceInUSD * USD_TO_UAH; 
    }

    @Override
    public float tax(Auto auto) {
        return vehiclePrice(auto) * 0.2f; 
    }
}
