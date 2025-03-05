class Car {
    private String bodyType;
    private Engine engine;
    private Transmission transmission;
    private Wheels wheels;
    private String color;

    public Car(String bodyType, Engine engine, Transmission transmission, Wheels wheels, String color) {
        this.bodyType = bodyType;
        this.engine = engine;
        this.transmission = transmission;
        this.wheels = wheels;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "bodyType='" + bodyType + '\'' +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", wheels=" + wheels +
                ", color='" + color + '\'' +
                '}';
    }
}
