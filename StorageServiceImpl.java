public class StorageServiceImpl implements StorageService {

    private final ItemRepository itemRepository;

    public StorageServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void storeItem(String item) {
        itemRepository.addItem(item);
    }

    @Override
    public void removeItem(String item) {
        itemRepository.deleteItem(item);
    }
}