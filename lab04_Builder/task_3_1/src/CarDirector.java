public class CarDirector {
    public Car buildSUV() {
        return new CarBuilder()
                .setBodyType("SUV")
                .setEngine(new Engine(250, 2.5, 320, "Petrol"))
                .setTransmission(new Transmission("Automatic", 8))
                .setWheels(new Wheels("Alloy", 18))
                .setColor("Black")
                .build();
    }

    public Car buildSedan() {
        return new CarBuilder()
                .setBodyType("Sedan")
                .setEngine(new Engine(180, 2.0, 260, "Diesel"))
                .setTransmission(new Transmission("Manual", 6))
                .setWheels(new Wheels("Steel", 16))
                .setColor("White")
                .build();
    }
}
