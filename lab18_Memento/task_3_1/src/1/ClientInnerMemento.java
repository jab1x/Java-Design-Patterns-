import java.util.ArrayList;
import java.util.List;

public class ClientInnerMemento {
    public static void main(String[] args) {
        TriangleWithInnerMemento triangle = new TriangleWithInnerMemento(3f, 3f, 3f);

        String[] edges = {"b", "c", "a", "c", "b"};
        float[]  values = {4f, 5f, 4f, 2f, 3f};

        List<TriangleWithInnerMemento.Memento> mementos = new ArrayList<>();
        List<Float> areas = new ArrayList<>();

        System.out.println("\n--- Using Inner Memento ---");
        for (int i = 0; i < edges.length; i++) {
            switch (edges[i]) {
                case "a": triangle.setA(values[i]); break;
                case "b": triangle.setB(values[i]); break;
                case "c": triangle.setC(values[i]); break;
            }
            float area = triangle.square();
            System.out.println("Current sides: a=" + triangle.getA()
                + ", b=" + triangle.getB() + ", c=" + triangle.getC()
                + " → area=" + area);

            TriangleWithInnerMemento.Memento m = triangle.createMemento();
            mementos.add(m);
            areas.add(area);
        }

        int idxMax = 0;
        for (int i = 1; i < areas.size(); i++) {
            if (areas.get(i) > areas.get(idxMax)) {
                idxMax = i;
            }
        }
        System.out.println("Max area = " + areas.get(idxMax) + 
            " отримано на кроці #" + idxMax);

        triangle.restoreFromMemento(mementos.get(idxMax));
        System.out.println("Restored to: a=" + triangle.getA()
            + ", b=" + triangle.getB() + ", c=" + triangle.getC());
    }
}
