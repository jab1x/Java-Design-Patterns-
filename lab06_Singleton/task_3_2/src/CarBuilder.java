class CarBuilder {
    private String bodyType;
    private Engine engine;
    private Transmission transmission;
    private Wheels wheels;
    private String color;

    public CarBuilder setBodyType(String bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public CarBuilder setWheels(Wheels wheels) {
        this.wheels = wheels;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Car build() {
        return new Car(bodyType, engine, transmission, wheels, color);
    }
}
