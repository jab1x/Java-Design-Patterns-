public class TriangleWithMarkerMemento {

    private float a, b, c;

    public TriangleWithMarkerMemento(float a, float b, float c) {
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

    public float perimeter() { return a + b + c; }

    public float square() {
        float p = perimeter() / 2f;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public TriangleMemento createMemento() {
        return new MementoImpl(a, b, c);
    }

    public void restoreFromMemento(TriangleMemento tm) {
        if (!(tm instanceof MementoImpl)) {
            throw new IllegalArgumentException("Неправильний знімок");
        }
        MementoImpl m = (MementoImpl) tm;
        this.a = m.a;
        this.b = m.b;
        this.c = m.c;
    }

    private static class MementoImpl implements TriangleMemento {
        private final float a, b, c;
        private MementoImpl(float a, float b, float c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
