public class Director {
    private static Director instance;

    private Director() {}

    public static Director getInstance() {
        if (instance == null) {
            instance = new Director();
        }
        return instance;
    }

    public void constructSportsCar(CarBuilder builder) {
        builder.reset();
        builder.setBodyType("Coupe");
        builder.setEngine(new Engine(450, 4.0, "Petrol"));
        builder.setTransmission(new Transmission("Automatic", 7));
        builder.setWheels(new Wheels("Alloy", 19));
        builder.setColor("Red");
    }

    public void constructSUV(CarBuilder builder) {
        builder.reset();
        builder.setBodyType("SUV");
        builder.setEngine(new Engine(300, 3.5, "Diesel"));
        builder.setTransmission(new Transmission("Automatic", 8));
        builder.setWheels(new Wheels("Steel", 18));
        builder.setColor("Black");
    }
}
