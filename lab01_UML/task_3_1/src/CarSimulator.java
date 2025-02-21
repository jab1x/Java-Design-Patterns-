public class CarSimulator {
    private CarBuilder carBuilder;

    public CarSimulator() {
        this.carBuilder = new CarBuilder();
    }

    public void simulate() {
        Car car = carBuilder.buildCar();
        System.out.println("Car simulation started");
    }

    public static void main(String[] args) {
        CarSimulator simulator = new CarSimulator();
        simulator.simulate();
    }
}
