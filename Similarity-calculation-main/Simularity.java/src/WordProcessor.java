import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class WordProcessor {
    private Set<String> distinctWords;

    public WordProcessor() {
        distinctWords = new HashSet<>();
    }

    public void readFile(String filePath) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    distinctWords.add(word.toLowerCase()); // Consider case-insensitive comparison
                }
            }
        }
    }

    public Set<String> getDistinctWords() {
        return distinctWords;
    }
}
