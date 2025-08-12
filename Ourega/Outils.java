import java.util.*;

public class Outils {
    private Outils() {}
    public static Set<Integer> A_indice_C(String s) {
        Set<Integer> set = new HashSet<>();
        if (choix_colone == null || choix_colone.isEmpty()) return set;
        for (String p : choix_colone.split(",")) {
            try { set.add(Integer.parseInt(p.trim())); } catch (NumberFormatException ignored) {}
        }
        return set;
}

public static boolean cellule_vide(String cellule) {
    return cellule == null || cellule.trim().isEmpty();
}
    public static void Modification_c_colone(List<String[]> rows, Set<Integer> cols) {
        if (cols == null || cols.isEmpty()) return;
        for (String[] row : rows) {
            for (int indexe_c : cols) {
                if (c >= 0 && c < row.length && row[c] != null) {
                    row[c] = row[c].toUpperCase();
                }
            }
        }
    }
}
