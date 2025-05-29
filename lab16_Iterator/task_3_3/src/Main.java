import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //  дерево
        Random random = new Random();
        Box root = new Box(-999);
        for (int j = 0; j < 10; j++) {
            Box box = new Box(j);
            root.add(box);
            for (int i = 0; i < 10; i++) {
                Item item = new Item("Item_" + (j * 10 + i), random.nextInt(1000));
                box.add(item);
            }
        }

        Iterator<Component> dfs = root.depthFirstIterator();
        Item min = null, max = null;
        while (dfs.hasNext()) {
            Component c = dfs.next();
            if (c instanceof Item) {
                Item it = (Item) c;
                if (min == null || it.getValue() < min.getValue()) min = it;
                if (max == null || it.getValue() > max.getValue()) max = it;
            }
        }

        System.out.println("Cheapest: " + min);
        System.out.println("Most expensive: " + max);

        System.out.println("\nBreadth-first traversal:");
        Iterator<Component> bfs = root.breadthFirstIterator();
        while (bfs.hasNext()) {
            Component c = bfs.next();
            if (c instanceof Item) c.execute();
        }
    }
}
