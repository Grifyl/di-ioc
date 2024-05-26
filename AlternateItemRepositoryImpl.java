import java.util.HashSet;
import java.util.Set;

public class AlternateItemRepositoryImpl implements ItemRepository {
    private Set<String> items = new HashSet<>();

    @Override
    public void addItem(String item) {
        items.add(item);
        System.out.println("Alternate repository: Item added: " + item);
    }

    @Override
    public void deleteItem(String item) {
        items.remove(item);
        System.out.println("Alternate repository: Item removed: " + item);
    }
}