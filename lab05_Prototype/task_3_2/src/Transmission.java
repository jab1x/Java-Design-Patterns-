public class Transmission implements Cloneable {
    private String type;
    private int gears;

    public Transmission(String type, int gears) {
        this.type = type;
        this.gears = gears;
    }

    @Override
    protected Transmission clone() throws CloneNotSupportedException {
        return (Transmission) super.clone();
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "type='" + type + '\'' +
                ", gears=" + gears +
                '}';
    }
}
