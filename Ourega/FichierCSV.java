import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class FichierCSV {
    private final String inputPath;
    private final String outputPath;

    public FichierCSV(String inputPath, String outputPath) {
        this.inputPath = inputPath;
        this.outputPath = outputPath;
    }
  public List<String[]> lire() throws IOException {
        List<String[]> lignes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(inputPath))) {
            String ligne;
            while ((ligne = br.readLine()) != null) {
                lignes.add(ligne.split(",", -1)); // -1 garde cellules vides
            }
       }
       return lignes;
  }
    public void ecrire(List<String[]> lignes) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))) {
            for (String[] row : lignes) {
                bw.write(String.join(",", row));
                bw.newLine();
            }
        }
    }
}
