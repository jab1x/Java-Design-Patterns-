import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class EngineFactory {
    private static final Map<String, Engine> cache = new ConcurrentHashMap<>();

    public static Engine getEngine(int power, Engine.Fuel fuel) {
        String key = power + ":" + fuel;
        return cache.computeIfAbsent(key, k -> new Engine(power, fuel));
    }
}
