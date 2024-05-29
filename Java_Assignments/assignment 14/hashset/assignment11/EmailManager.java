package assgn_14.hashset.assignment11;
import java.util.*;

class UniqueEmailCollector {
    private HashSet<String> emailSet;

    public UniqueEmailCollector() {
        this.emailSet = new HashSet<>();
    }

    public void addEmail(String email) {
        if (emailSet.add(email)) {
            System.out.println("Email added successfully.");
        } else {
            System.out.println("Email already exists.");
        }
    }

    public void checkEmailExists(String email) {
        if (emailSet.contains(email)) {
            System.out.println("Email exists in the collection.");
        } else {
            System.out.println("Email does not exist in the collection.");
        }
    }

    public void removeEmail(String email) {
        if (emailSet.remove(email)) {
            System.out.println("Email removed successfully.");
        } else {
            System.out.println("Email not found in the collection.");
        }
    }

    public void displayAllEmails() {
        if (emailSet.isEmpty()) {
            System.out.println("No emails in the collection.");
        } else {
            System.out.println("All unique email addresses:");
            for (String email : emailSet) {
                System.out.println(email);
            }
        }
    }
}

public class EmailManager {
    public static void main(String[] args) {
        UniqueEmailCollector emailCollector = new UniqueEmailCollector();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Unique Email Collector:");
            System.out.println("1. Add a new email address");
            System.out.println("2. Check if an email address exists");
            System.out.println("3. Remove an email address");
            System.out.println("4. Display all unique email addresses");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter email address: ");
                    String email = scanner.nextLine();
                    emailCollector.addEmail(email);
                    break;
                case 2:
                    System.out.print("Enter email address to check: ");
                    String checkEmail = scanner.nextLine();
                    emailCollector.checkEmailExists(checkEmail);
                    break;
                case 3:
                    System.out.print("Enter email address to remove: ");
                    String removeEmail = scanner.nextLine();
                    emailCollector.removeEmail(removeEmail);
                    break;
                case 4:
                    emailCollector.displayAllEmails();
                    break;
                case 5:
                    System.out.println("Exited");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}