import java.util.List;

public class WarehouseUtil {

    // Wildcard method
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(
                item.getCategory() + " : " + item.getName()
            );
        }
    }
}
