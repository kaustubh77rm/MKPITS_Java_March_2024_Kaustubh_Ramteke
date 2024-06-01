//### Problem 1: Unique Words Counter
//**Objective:** Implement a program that reads a large text file and counts the number of unique words.
//
//**Requirements:**
//- Use `HashSet` to store and ensure the uniqueness of words.
//- Read the file line by line, split each line into words, and add them to the `HashSet`.
//- Output the total count of unique words found in the text.
package assn_17;
import java.util.*;
import java.io.*;

public class UniqueWords {
    public static void main(String[] args) {
        Set<String> uniqueWords = new HashSet<>();

        File file = new File("C:\\TURBOC3\\BIN\\Java\\MyProject\\pqr.txt");

        try {
            // streams to read the file
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            // read the file line by line
            while ((line = bufferedReader.readLine()) != null) {
                // Split each line into words using a regular expression to handle different delimiters
                String[] words = line.split("\\W+");

                // Add each word to the HashSet
                for (String word : words) {
                    if (!word.isEmpty()) {
                        uniqueWords.add(word.toLowerCase());
                    }
                }
            }
            bufferedReader.close();

            // Output the total count of unique words
            System.out.println("Total unique words: " + uniqueWords.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}