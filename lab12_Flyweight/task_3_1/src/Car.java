import java.util.List;

public class Car {
    private final Engine engine;
    private final List<Wheel> wheels;

    public Car(Engine engine, List<Wheel> wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void drive() {
        engine.start();
        for (Wheel w : wheels) {
            w.rotate();
        }
        System.out.println("Car is driving with engine [" + engine.getType() +
                           "] and wheels [" + wheels.get(0).getModel() + "]");
    }
}
