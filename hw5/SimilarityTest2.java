import java.io.File;

/**
 * 08722 Data Structures for Application Programmers.
 *
 * Homework Assignment 5
 * Document Similarity Acceptance Test (case 2)
 *
 * DO NOT MODIFY THIS CLASS!
 * @author Terry Lee
 */
public class SimilarityTest2 {

    /**
     * Test program to check Similarity with files.
     * @param args arguments
     */
    public static void main(String[] args) {
        Similarity file1 = new Similarity(new File("benhur.txt"));
        printOutput(file1);

        Similarity file2 = new Similarity(new File("lifeofjesus.txt"));
        printOutput(file2);

        System.out.println(file1.dotProduct(file2.getMap()) + " dot product.");
        System.out.println(file1.distance(file2.getMap()) + " distance.");
    }

    /**
     * Prints some values of Similarity object.
     * @param sim Similarity object to deal with
     */
    private static void printOutput(Similarity sim) {
        System.out.println(sim.numOfLines() + " lines.");    
        System.out.println(sim.numOfWords() + " words.");
        System.out.println(sim.numOfWordsNoDups() + " distinct words.");
        System.out.println(sim.euclideanNorm() + " Euclidean norm.\n");
    }
}

/*
 * <EXPECTED OUTPUT>
 *
 * 24777 lines.
 * 204407 words.
 * 12311 distinct words.
 * 23350.40057472248 Euclidean norm.
 *
 * 13598 lines.
 * 116847 words.
 * 9876 distinct words.
 * 13773.146735586606 Euclidean norm.
 *
 * 3.07726162E8 dot product.
 * 0.29488804370733035 distance.
 */
