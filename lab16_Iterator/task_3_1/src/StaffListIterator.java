import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StaffListIterator implements Iterator<Employee> {
    private final List<Employee> sorted;
    private int index = 0;

    public StaffListIterator(List<Employee> employees) {
        this.sorted = new ArrayList<>(employees);
        this.sorted.sort(Comparator.comparing(Employee::getName));
    }

    @Override
    public boolean hasNext() {
        return index < sorted.size();
    }

    @Override
    public Employee next() {
        return sorted.get(index++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
