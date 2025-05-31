import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3f, 3f, 3f);

        String[] edges = {
            "b",
            "c",
            "a",
            "duplicateA",
            "c",
            "b",
            "halfA"
        };

        float[] values = {
            4f,    // setB(4)
            5f,    // setC(5)
            4f,    // setA(4)
            1f,    // duplicateA()
            6f,    // setC(6)
            3f,    // setB(3)
            1f     // halfA() 
        };

        List<Triangle.Memento> mementos = new ArrayList<>();
        List<Float> areas = new ArrayList<>();

        System.out.println("\n--- Applying commands and saving history ---");
        for (int i = 0; i < edges.length; i++) {
            Triangle.Memento before = triangle.createMemento();

            Command cmd = null;
            switch (edges[i]) {
                case "a":
                    cmd = new SetACommand(triangle, values[i]);
                    break;
                case "b":
                    cmd = new SetBCommand(triangle, values[i]);
                    break;
                case "c":
                    cmd = new SetCCommand(triangle, values[i]);
                    break;
                case "duplicateA":
                    cmd = new DuplicateACommand(triangle);
                    break;
                case "duplicateB":
                    cmd = new DuplicateBCommand(triangle);
                    break;
                case "duplicateC":
                    cmd = new DuplicateCCommand(triangle);
                    break;
                case "halfA":
                    cmd = new HalfACommand(triangle);
                    break;
                case "halfB":
                    cmd = new HalfBCommand(triangle);
                    break;
                case "halfC":
                    cmd = new HalfCCommand(triangle);
                    break;
                default:
                    System.out.println("Unknown operation: " + edges[i]);
            }

            if (cmd != null) {
                cmd.execute();
            }

            float area = triangle.square();
            System.out.println("After operation '" + edges[i] + "': "
                + "sides=(a=" + triangle.getA()
                + ", b=" + triangle.getB()
                + ", c=" + triangle.getC() + ") → area=" + area);

            mementos.add(before);
            areas.add(area);
        }

        int idxMin = 0;
        for (int i = 1; i < areas.size(); i++) {
            if (areas.get(i) < areas.get(idxMin)) {
                idxMin = i;
            }
        }

        System.out.println("\n--- Minimum area was " + areas.get(idxMin)
            + " at step #" + idxMin + " ---");

        triangle.restoreFromMemento(mementos.get(idxMin));
        System.out.println("Restored to state: sides=(a=" + triangle.getA()
            + ", b=" + triangle.getB() + ", c=" + triangle.getC() + ") "
            + "→ area=" + triangle.square());
    }
}
