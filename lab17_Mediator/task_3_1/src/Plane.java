public class Plane {
    private final int id;
    private boolean isInTheAir = false;
    private final FlightMediator atc;

    public Plane(int id, FlightMediator atc) {
        this.id = id;
        this.atc = atc;
        atc.registerPlane(this);
    }

    public int getId() {
        return id;
    }

    public boolean getIsInTheAir() {
        return isInTheAir;
    }

    void setInTheAir(boolean inTheAir) {
        isInTheAir = inTheAir;
    }

    public void takeOff() {
        atc.requestTakeOff(this);
    }

    public void land() {
        atc.requestLanding(this);
    }
}
