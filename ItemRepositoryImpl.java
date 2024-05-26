import java.util.ArrayList;
import java.util.List;

public class ItemRepositoryImpl implements ItemRepository {
    private List<String> items = new ArrayList<>();

    @Override
    public void addItem(String item) {
        items.add(item);
        System.out.println("Item added: " + item);
    }

    @Override
    public void deleteItem(String item) {
        items.remove(item);
        System.out.println("Item removed: " + item);
    }
}