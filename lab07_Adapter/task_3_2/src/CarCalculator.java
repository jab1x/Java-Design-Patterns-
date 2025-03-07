public class CarCalculator implements VehicleCalculator {
    private Vehicle vehicle;

    @Override
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String calculatePrice() {
        return "10000"; // $
    }
}
