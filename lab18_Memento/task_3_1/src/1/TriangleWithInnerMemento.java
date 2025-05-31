public class TriangleWithInnerMemento {

    private float a, b, c;

    public TriangleWithInnerMemento(float a, float b, float c) {
        if (!checkExistence(a, b, c)) {
            throw new IllegalArgumentException("Triangle does not exist");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() { return a; }
    public float getB() { return b; }
    public float getC() { return c; }

    public static boolean checkExistence(float a, float b, float c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public void setA(float newA) {
        if (checkExistence(newA, b, c)) {
            this.a = newA;
        } else {
            System.out.println("Error: cannot set a=" + newA);
        }
    }

    public void setB(float newB) {
        if (checkExistence(a, newB, c)) {
            this.b = newB;
        } else {
            System.out.println("Error: cannot set b=" + newB);
        }
    }

    public void setC(float newC) {
        if (checkExistence(a, b, newC)) {
            this.c = newC;
        } else {
            System.out.println("Error: cannot set c=" + newC);
        }
    }

    public float perimeter() {
        return a + b + c;
    }

    public float square() {
        float p = perimeter() / 2f;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public Memento createMemento() {
        return new Memento(a, b, c);
    }

    public void restoreFromMemento(Memento m) {
        this.a = m.a;
        this.b = m.b;
        this.c = m.c;
    }

    public class Memento {
        private final float a, b, c;
        private Memento(float a, float b, float c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
