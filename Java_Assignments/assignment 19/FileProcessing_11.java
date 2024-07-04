// 11. File Processing:
// Read a text file line by line using the Files.lines() method
// and process each line using a stream.
package assignment_19;
import java.lang.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class FileProcessing_11 {
    public static void main(String[] args) throws FileNotFoundException {
        Path filePath = Paths.get("C:\\TURBOC3\\BIN\\Java\\MyProject\\pqr.txt");
        try (Stream<String> lines = Files.lines(filePath)) {
            // Process each line using a stream
            lines.forEach(System.out::println); // Print each line
        } catch (IOException e) {
            e.printStackTrace();
          }
    }
}