import java.util.*;
  
public class Shop implements Iterable<ShopItem> {
    private final Map<String, ShopItem> items = new HashMap<>();

    public void putItem(ShopItem item) {
        items.put(item.getName(), item);
    }

    @Override
    public Iterator<ShopItem> iterator() {
        return new ShopNameIterator(new ArrayList<>(items.values()));
    }

    public Iterator<ShopItem> quantityIterator() {
        return new ShopQuantityIterator(new ArrayList<>(items.values()));
    }

    public Iterable<ShopItem> byQuantityDesc() {
        return () -> quantityIterator();
    }
}
