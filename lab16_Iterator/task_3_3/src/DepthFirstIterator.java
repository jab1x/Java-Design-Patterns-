import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class DepthFirstIterator implements Iterator<Component> {
    private final Stack<Iterator<Component>> stack = new Stack<>();

    public DepthFirstIterator(Box root) {
        stack.push(List.of((Component)root).iterator());
        stack.push(root.getChildren().iterator());
    }

    @Override
    public boolean hasNext() {
        while (!stack.isEmpty()) {
            if (stack.peek().hasNext()) {
                return true;
            }
            stack.pop();
        }
        return false;
    }

    @Override
    public Component next() {
        Iterator<Component> itr = stack.peek();
        Component c = itr.next();
        if (c instanceof Box) {
            stack.push(((Box) c).getChildren().iterator());
        }
        return c;
    }
}
