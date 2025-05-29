import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlanesInFlight {
    private final List<Plane> planes = new ArrayList<>();

    public void addPlane(Plane p) {
        planes.add(p);
    }

    public void removePlane(Plane p) {
        planes.remove(p);
    }

    public List<Integer> getPlaneIds() {
        return planes.stream().map(Plane::getId).collect(Collectors.toList());
    }
}
