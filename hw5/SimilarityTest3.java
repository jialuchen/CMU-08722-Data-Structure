import java.io.File;

/**
 * 08722 Data Structures for Application Programmers.
 *
 * Homework Assignment 5
 * Document Similarity Acceptance Test (case 3)
 *
 * DO NOT MODIFY THIS CLASS!
 * @author Terry Lee
 */
public class SimilarityTest3 {

    /**
     * Test program to check Similarity with files of large size.
     * @param args arguments
     */
    public static void main(String[] args) {
        Similarity file1 = new Similarity(new File("childrensbible.txt"));
        printOutput(file1);

        Similarity file2 = new Similarity(new File("kjv.txt"));
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
 * 1343 lines.
 * 9398 words.
 * 1425 distinct words.
 * 1126.465267995423 Euclidean norm.
 *
 * 100222 lines.
 * 794914 words.
 * 12892 distinct words.
 * 100816.66166859523 Euclidean norm.
 *
 * 1.0691544E8 dot product.
 * 0.3439354904679285 distance.
 */
