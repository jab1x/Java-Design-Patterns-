public class LinearEquation extends Equation {
    private double a, b;

    public LinearEquation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public LinearEquation clone() {
        return new LinearEquation(a, b);
    }

    @Override
    public void solve() {
        if (a != 0) {
            System.out.println("Solution: x = " + (-b / a));
        } else {
            System.out.println("No solution or infinite solutions.");
        }
    }
}
