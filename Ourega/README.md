Description générale
Cet outil Java permet de lire un fichier CSV, de nettoyer les valeurs manquantes selon des règles définies, et de standardiser certaines colonnes (par exemple en les mettant en majuscules).
Il est conçu de manière modulaire avec plusieurs classes séparées pour respecter la programmation orientée objet (POO).



Classes créées
1. FichierCSV.java
Rôle : Gérer la lecture et l’écriture des fichiers CSV.

Méthodes principales :

lire() : lit le fichier CSV ligne par ligne et retourne une liste de tableaux de chaînes de caractères.

ecrire(List<String[]> lignes) : écrit la liste de lignes modifiées dans un fichier CSV de sortie.










2. NettoyeurCSV.java
Rôle : Appliquer les règles de nettoyage sur les données lues depuis le CSV.

Fonctionnalités :

Supprimer ou remplacer les cellules vides selon les paramètres définis.

Passer certaines colonnes en majuscules.

Utilise les méthodes utilitaires de la classe Outils pour effectuer les traitements.








3. Outils.java
Rôle : Fournir des méthodes utilitaires réutilisables dans le projet.

Méthodes principales :

A_indice_C(String choix_colone) : convertir une liste d’indices sous forme de texte ("0,2,5") en un Set<Integer>.

cellule_vide(String cellule) : vérifier si une cellule est vide ou contient uniquement des espaces.

Modification_c_colone(List<String[]> rows, Set<Integer> cols) : mettre en majuscules les colonnes spécifiées.

Fonctionnement général
L’utilisateur choisit le fichier CSV à nettoyer.

L’utilisateur définit :

Une valeur de remplacement pour les cellules vides (ou laisse vide pour supprimer les lignes concernées).

Les indices de colonnes à mettre en majuscules.

L’outil lit le fichier CSV, applique les transformations, puis enregistre le fichier nettoyé.
