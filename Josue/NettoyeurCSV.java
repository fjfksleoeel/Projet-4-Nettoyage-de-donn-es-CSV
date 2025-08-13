import java.util.ArrayList;
import java.util.List;

public class NettoyeurCSV {
    private final FichierCSV fichier;
    private final ReglesNettoyage regles;

    public NettoyeurCSV(FichierCSV fichier, ReglesNettoyage regles) {
        this.fichier = fichier;
        this.regles = regles;
    }

    public void executer() throws Exception {
        List<String[]> data = fichier.lire();
        if (data.isEmpty()) return;

        List<String[]> cleaned = nettoyerManquants(data);
        Outils.toUpperInPlace(cleaned, regles.getUpperCols());
        fichier.ecrire(cleaned);
    }

    private List<String[]> nettoyerManquants(List<String[]> rows) {
        boolean supprimer = regles.supprimerLignesAvecManquants();
        String repl = regles.getReplacement();

        List<String[]> out = new ArrayList<>();
        for (String[] row : rows) {
            boolean hasMissing = false;
            for (int i = 0; i < row.length; i++) {
                if (Outils.isMissing(row[i])) {
                    hasMissing = true;
                    if (!supprimer) row[i] = repl;
                }
            }
            if (supprimer) {
                if (!hasMissing) out.add(row);
            } else {
                out.add(row);
            }
        }
        return out;
    }
}

