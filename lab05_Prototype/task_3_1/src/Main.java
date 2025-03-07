// як приклад роботи
public class Main { 
    public static void main(String[] args) {
        LinearEquation linear = new LinearEquation(2, 5);
        QuadraticEquation quadratic = new QuadraticEquation(1, -3, 2);

        System.out.println("Solving original equations:");
        linear.solve();
        quadratic.solve();

        // клонування рівнянь
        LinearEquation clonedLinear = linear.clone();
        QuadraticEquation clonedQuadratic = quadratic.clone();

        System.out.println("Solving cloned equations:");
        clonedLinear.solve();
        clonedQuadratic.solve();
    }
}
