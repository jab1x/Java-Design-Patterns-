import java.util.*;

public class ShopQuantityIterator implements Iterator<ShopItem> {
    private final List<ShopItem> sorted;
    private int index = 0;

    public ShopQuantityIterator(List<ShopItem> items) {
        this.sorted = new ArrayList<>(items);
        this.sorted.sort((a, b) -> Integer.compare(b.getQuantity(), a.getQuantity()));
    }

    @Override
    public boolean hasNext() {
        return index < sorted.size();
    }

    @Override
    public ShopItem next() {
        return sorted.get(index++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
