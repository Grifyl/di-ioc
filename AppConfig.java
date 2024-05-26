import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppConfig {
    private static AppConfig instance;
    private final ItemRepository itemRepository;
    private final StorageService storageService;

    private AppConfig() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("config.properties"));
        } catch (IOException e) {
            throw new RuntimeException("Failed to load configuration", e);
        }

        String repositoryType = properties.getProperty("repository.type");

        if ("alternate".equalsIgnoreCase(repositoryType)) {
            itemRepository = new AlternateItemRepositoryImpl();
        } else {
            itemRepository = new ItemRepositoryImpl();
        }

        storageService = new StorageServiceImpl(itemRepository);
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public ItemRepository getItemRepository() {
        return itemRepository;
    }

    public StorageService getStorageService() {
        return storageService;
    }
}