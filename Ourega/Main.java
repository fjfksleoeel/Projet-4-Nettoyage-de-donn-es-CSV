import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Choisir le CSV d'entrée
            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle("Sélectionner le fichier CSV à nettoyer");
            chooser.setFileFilter(new FileNameExtensionFilter("Fichiers CSV", "csv"));
            if (chooser.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) {
                System.out.println("Aucun fichier sélectionné. Fin.");
                return;
            }
            String inputPath = chooser.getSelectedFile().getAbsolutePath();

            // Choisir le CSV de sortie
            chooser.setDialogTitle("Choisir l'emplacement du CSV de sortie");
            if (chooser.showSaveDialog(null) != JFileChooser.APPROVE_OPTION) {
                System.out.println("Aucun fichier de sortie choisi. Fin.");
                return;
            }
            String outputPath = chooser.getSelectedFile().getAbsolutePath();
            if (!outputPath.toLowerCase().endsWith(".csv")) outputPath += ".csv";

            // Paramètres de nettoyage
            System.out.print("Valeur de remplacement pour manquants (laisser vide = supprimer la ligne) : ");
            String replacement = sc.nextLine();
            System.out.print("Colonnes à mettre en MAJUSCULES (indices 0-based, ex: 0,2) : ");
            Set<Integer> A_indice_C = Outils.A_indice_C(sc.nextLine().trim());

            // Assemblage des objets (POO)
            ReglesNettoyage regles = new ReglesNettoyage(replacement, A_indice_C);
            FichierCSV fichier = new FichierCSV(inputPath, outputPath);
            NettoyeurCSV service = new NettoyeurCSV(fichier, regles);

            service.executer(); // toute la logique est dans la classe de service
            System.out.println(" Terminé. Fichier écrit : " + outputPath);
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage()); // gestion d’exception simple
        } finally {
            sc.close();
        }
    }
}
