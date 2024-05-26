# di-ioc
Cette application de gestion de stockage dans un entrepôt démontre l'utilisation de l'injection de dépendance (DI) et de l'inversion de contrôle (IoC) en Java sans utiliser un framework comme Spring.

## Structure du projet

- `StorageService.java` : Interface pour les opérations de stockage.
- `ItemRepository.java` : Interface pour les opérations de gestion des articles.
- `ItemRepositoryImpl.java` : Implémentation par défaut de `ItemRepository` utilisant une liste.
- `AlternateItemRepositoryImpl.java` : Implémentation alternative de `ItemRepository` utilisant un ensemble.
- `StorageServiceImpl.java` : Implémentation de `StorageService` utilisant un `ItemRepository`.
- `AppConfig.java` : Classe de configuration pour assembler les dépendances en fonction des propriétés configurées.
- `MainApp.java` : Classe principale pour exécuter l'application.
- `config.properties` : Fichier de configuration pour spécifier l'implémentation à utiliser (default ou alternate).


## Auteur

Pierre REYNAUD