import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstIterator implements Iterator<Component> {
    private final Queue<Component> queue = new LinkedList<>();

    public BreadthFirstIterator(Box root) {
        queue.add(root);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Component next() {
        Component c = queue.poll();
        if (c instanceof Box) {
            queue.addAll(((Box) c).getChildren());
        }
        return c;
    }
}
