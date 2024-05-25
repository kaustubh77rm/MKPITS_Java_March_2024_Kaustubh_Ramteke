package stud;
import java.io.*;
import java.util.Scanner;

public class StringBufferClass2 {

    public void displayAndAddNames() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter("kpr.txt", true))) {
            String name, choice;
            do {
                System.out.print("Enter name: ");
                name = br.readLine();
                bw.write(name);
                bw.newLine();
                System.out.print("Do you want to continue (y/n): ");
                choice = br.readLine();
            } while (choice.equalsIgnoreCase("y"));
        } catch (IOException e) {
            System.out.println("An error occurred while adding names: " + e.getMessage());
        }
    }

    public static void readFromFile() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String ask = s.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(ask))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    public static void copyFile(String source, String target) {
        File sfile = new File(source);
        File tfile = new File(target);

                try (BufferedReader br = new BufferedReader(new FileReader(source));
                     BufferedWriter bw = new BufferedWriter(new FileWriter(target))){
                     String line;
                    while ((line = br.readLine()) != null) {
                        bw.write(line);
                        bw.newLine();
                    }

                } catch (IOException e) {
                    System.out.println("An error occurred while copying the file: " + e.getMessage());
                }
            }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBufferClass2 obj = new StringBufferClass2();
        System.out.println("1. Display and add names");
        System.out.println("2. Read from file");
        System.out.println("3. Copy file content");
        System.out.print("Choose an option: ");

        int choice = s.nextInt();
        s.nextLine();  // consume the newline character
        switch (choice) {
            case 1:
                obj.displayAndAddNames();
                break;
            case 2:
                readFromFile();
                break;
            case 3:
                System.out.print("Enter source file name: ");
                String source = s.nextLine();
                System.out.print("Enter target file name: ");
                String target = s.nextLine();
                copyFile(source, target);
                break;
            default:
                System.out.println("Invalid choice.");
        }
        s.close();
    }
}