import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();

    // Add item safely
    public void addItem(T item) {
        items.add(item);
    }

    // Get all items
    public List<T> getItems() {
        return items;
    }
}
