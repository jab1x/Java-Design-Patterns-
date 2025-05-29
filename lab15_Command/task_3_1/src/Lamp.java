import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lamp {
    private static final List<Lamp> REGISTRY = new ArrayList<>();

    private final String name;
    private boolean isLightOn;

    public Lamp(String name) {
        this.name = name;
        this.isLightOn = false;
        REGISTRY.add(this);
    }

    public Lamp() {
        this("default");
    }

    public void lightOn() {
        if (!isLightOn) {
            System.out.println(name + ": Light is on");
            isLightOn = true;
        }
    }

    public void lightOff() {
        if (isLightOn) {
            System.out.println(name + ": Light is off");
            isLightOn = false;
        }
    }

    public static List<Lamp> getAllLamps() {
        return Collections.unmodifiableList(REGISTRY);
    }
}
