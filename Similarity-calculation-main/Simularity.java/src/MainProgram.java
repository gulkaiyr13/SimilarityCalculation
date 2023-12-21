import java.io.IOException;
import java.util.Set;

public class MainProgram {
    public static void main(String[] args) {
        try {
            WordProcessor wordProcessor1 = new WordProcessor();
            wordProcessor1.readFile("C:/Intel/IdeaProjects/Similarity-calculation-main/Similarity-calculation-main/Simularity.java/src/file1.txt");
            Set<String> distinctWords1 = wordProcessor1.getDistinctWords();

            WordProcessor wordProcessor2 = new WordProcessor();
            wordProcessor2.readFile("C:/Intel/IdeaProjects/Similarity-calculation-main/Similarity-calculation-main/Simularity.java/src/file2.txt");
            Set<String> distinctWords2 = wordProcessor2.getDistinctWords();

            SimilarityCalculator similarityCalculator = new SimilarityCalculator();
            double similarity = similarityCalculator.calculateSimilarity(distinctWords1, distinctWords2);

            System.out.println("Jaccard Similarity Coefficient: " + similarity);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
