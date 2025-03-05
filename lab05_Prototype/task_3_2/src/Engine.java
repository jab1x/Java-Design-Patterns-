class Engine implements Cloneable {
    private int power;
    private double volume;
    private int torque;
    private String fuelType;

    public Engine(int power, double volume, int torque, String fuelType) {
        this.power = power;
        this.volume = volume;
        this.torque = torque;
        this.fuelType = fuelType;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", volume=" + volume +
                ", torque=" + torque +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
