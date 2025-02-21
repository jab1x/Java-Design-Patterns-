class Car {
    private Engine engine;
    private Wheel wheel;

    public Car() {
        this.engine = new Engine();
        this.wheel = new Wheel();
        System.out.println("Car assembled");
    }
}
