 le nom du projet:  Projet-4-Nettoyage-de-donn-es-CSV
les noms des membres: Dago Ourega
                      Josue Joachim
les fonctionnalités développées : 
          Sélection de fichiers via l’explorateur
          Choix du CSV d’entrée et du CSV de sortie avec JFileChooser (filtre .csv).
          Lecture/écriture de CSV simples
          Lecture ligne par ligne, découpe par virgule , avec split(",", -1) pour conserver les cellules vides.
          Écriture en réassemblant par String.join(",").
          Traitement des valeurs manquantes
          Si tu fournis une valeur de remplacement, chaque cellule vide est remplacée par cette valeur.
          Si tu laisses vide, les lignes qui contiennent au moins une cellule vide sont supprimées.
          Standardisation de colonnes
          Mise en MAJUSCULES des colonnes dont tu donnes les indices 0-based (ex. 0,2).
          Paramétrage clair via POO
          ReglesNettoyage porte les règles (valeur de remplacement, colonnes à upper).
          FichierCSV encapsule I/O.
          NettoyeurCSV applique les règles (nettoyage manquants + upper-case).
          Outils fournit les utilitaires (parsing d’indices, test de cellule vide).
          Main orchestre l’IHM (choix fichiers + saisies console).
          Validation minimale
        Indices de colonnes sécurisés (bornes vérifiées).


les instructions d'exécution    :
                 JDK 8+ installé (recommandé 11+).
                Les fichiers .java suivants dans le même dossier (ou un package commun si tu en ajoutes un) :
                Main.java, FichierCSV.java, ReglesNettoyage.java, NettoyeurCSV.java, Outils.java.
                Sélectionne le fichier CSV d’entrée dans la boîte de dialogue.
                Choisis l’emplacement et le nom du CSV de sortie (ajoute .csv si nécessaire).
                Saisis la “Valeur de remplacement pour manquants” :
                Laisse vide pour supprimer toute ligne contenant une cellule vide.
                Saisis par ex. N/A pour remplacer chaque cellule vide par N/A.
                Saisis les “Colonnes à mettre en MAJUSCULES” (indices 0-based, ex. 0,2,5).
                Laisse vide si tu ne veux pas de mise en majuscules.
                Le programme indique Terminé. Fichier écrit : ... quand c’est fini.
