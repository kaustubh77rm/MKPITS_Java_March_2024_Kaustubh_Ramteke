package stud;
import java.io.*;

public class myFun {
    public static void main(String[] args) throws Exception {
        int countLine=0, countWords=0, countChar=0;
        String line;

        File file = new File("C:\\TURBOC3\\BIN\\Java\\MyProject\\abc.txt");

        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        while((line=bufferedReader.readLine())!=null){
                countLine=countLine+1;
                countChar+=line.length();
                String[] words=line.split("\\s+");
                countWords=countWords+words.length;
            }
        System.out.println("count line : "+countLine);
        System.out.println("count word : "+countWords);
        System.out.println("count char : "+countChar);
    }
}