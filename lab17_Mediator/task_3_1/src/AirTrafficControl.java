import java.util.ArrayList;
import java.util.List;

public class AirTrafficControl implements FlightMediator {
    private final Runway runway = new Runway();
    private final PlanesInFlight planesInFlight = new PlanesInFlight();
    private final PlanesOnGround planesOnGround = new PlanesOnGround();

    @Override
    public void registerPlane(Plane plane) {
        planesOnGround.addPlane(plane);
    }

    @Override
    public void requestTakeOff(Plane plane) {
        if (!plane.getIsInTheAir() && runway.isAvailable()) {
            System.out.println("ATC: Clearing plane " + plane.getId() + " for takeoff.");
            runway.setAvailable(false);
            planesOnGround.removePlane(plane);
            planesInFlight.addPlane(plane);
            plane.setInTheAir(true);
            runway.setAvailable(true);
        } else {
            System.out.println("ATC: Plane " + plane.getId() + " cannot take off now.");
        }
    }

    @Override
    public void requestLanding(Plane plane) {
        if (plane.getIsInTheAir() && runway.isAvailable()) {
            System.out.println("ATC: Clearing plane " + plane.getId() + " for landing.");
            runway.setAvailable(false);
            planesInFlight.removePlane(plane);
            planesOnGround.addPlane(plane);
            plane.setInTheAir(false);
            runway.setAvailable(true);
        } else {
            System.out.println("ATC: Plane " + plane.getId() + " cannot land now.");
        }
    }

    // Для діагностики
    public void printStatus() {
        System.out.println("In flight:   " + planesInFlight.getPlaneIds());
        System.out.println("On ground:   " + planesOnGround.getPlaneIds());
        System.out.println("Runway free: " + runway.isAvailable());
    }
}
