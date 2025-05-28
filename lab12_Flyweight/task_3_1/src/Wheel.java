public class Wheel {
    private final String model;

    public Wheel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void rotate() {
        System.out.println("Wheel " + model + " rotating.");
    }
}
