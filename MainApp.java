public class MainApp {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();
        StorageService storageService = config.getStorageService();

        storageService.storeItem("Téléphone");
        storageService.storeItem("TV");
        storageService.removeItem("Téléphone");
    }
}
