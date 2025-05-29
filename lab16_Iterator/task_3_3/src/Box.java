import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box implements Component, Iterable<Component> {
    private final int id;
    private final List<Component> children = new ArrayList<>();

    public Box(int id) {
        this.id = id;
    }

    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void execute() {
        for (Component c : children) {
            c.execute();
        }
    }

    public Iterator<Component> depthFirstIterator() {
        return new DepthFirstIterator(this);
    }

    public Iterator<Component> breadthFirstIterator() {
        return new BreadthFirstIterator(this);
    }

    @Override
    public Iterator<Component> iterator() {
        return depthFirstIterator();
    }

    List<Component> getChildren() {
        return children;
    }
}
