import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class WheelFactory {
    private static final Map<Integer, Wheel> cache = new ConcurrentHashMap<>();

    public static Wheel getWheel(int diameter) {
        return cache.computeIfAbsent(diameter, d -> new Wheel(d));
    }
}
