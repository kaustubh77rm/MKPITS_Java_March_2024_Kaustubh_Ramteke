package stud;
import java.io.*;

public class FileClass {
    public void displayFileClass() {
        File d = new File("D:\\abc");
        System.out.println(d.exists());
        File e = new File("F:\\", "F:\\MKPITS\\");
        System.out.println(e.exists());
        File f = new File("C:\\TURBOC3\\BIN\\Java\\MyProject\\stud");
        String[] files = f.list();
        for (String file : files) {
            System.out.println(file);
        }
    }

    public static void main(String[] args) {
        new FileClass().displayFileClass();
    }
}