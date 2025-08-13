import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ReglesNettoyage {
    private final String replacement;       // si vide/null => supprime lignes avec manquants
    private final Set<Integer> upperCols;   // colonnes à passer en MAJ

    public ReglesNettoyage(String replacement, Set<Integer> upperCols) {
        this.replacement = (replacement == null) ? "" : replacement;
        this.upperCols = (upperCols == null) ? new HashSet<>() : new HashSet<>(upperCols);
    }

    public boolean supprimerLignesAvecManquants() {
        return this.replacement.isEmpty();
    }

    public String getReplacement() {
        return replacement;
    }

    public Set<Integer> getUpperCols() {
        return Collections.unmodifiableSet(upperCols);
    }
}

