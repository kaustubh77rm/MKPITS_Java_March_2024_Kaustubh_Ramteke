package stud;
import java.io.*;
import java.util.*;

public class OccurrencesCode {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = s.nextLine();
        File file = new File("C:\\TURBOC3\\BIN\\Java\\MyProject\\abc.txt");

        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
        int occurrences = 0;

        while ((line = bufferedReader.readLine()) != null){
            occurrences += countOccurrences(line, str);
        }
        bufferedReader.close();
        System.out.println("occurrence: " + occurrences);
    }

    public static int countOccurrences(String line, String str) {
        int count = 0;
        int index = 0;

        while ((index = line.indexOf(str, index)) != -1) {
            count++;
            index += str.length();
        }
        return count;
    }
}