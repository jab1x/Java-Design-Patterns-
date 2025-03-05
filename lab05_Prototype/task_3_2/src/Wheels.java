class Wheels implements Cloneable {
    private String material;
    private int diameter;

    public Wheels(String material, int diameter) {
        this.material = material;
        this.diameter = diameter;
    }

    @Override
    protected Wheels clone() throws CloneNotSupportedException {
        return (Wheels) super.clone();
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "material='" + material + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}
