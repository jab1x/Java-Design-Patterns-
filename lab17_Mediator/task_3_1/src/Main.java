public class Main {
    public static void main(String[] args) {
        AirTrafficControl atc = new AirTrafficControl();

        Plane plane123 = new Plane(123, atc);
        Plane plane456 = new Plane(456, atc);

        plane123.takeOff();
        plane456.takeOff();

        atc.printStatus();

        plane123.land();

        atc.printStatus();
    }
}
