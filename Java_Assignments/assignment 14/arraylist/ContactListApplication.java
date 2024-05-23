package assgn_14.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    private String contactID;
    private String name;
    private String phoneNumber;
    private String email;

    public Contact(String contactID, String name, String phoneNumber, String email) {
        this.contactID = contactID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getContactID() {
        return contactID;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactID='" + contactID + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class ContactList {
    private ArrayList<Contact> contacts;

    public ContactList() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    public void removeContactByID(String contactID) {
        Contact contactToRemove = null;
        for (Contact contact : contacts) {
            if (contact.getContactID().equals(contactID)) {
                contactToRemove = contact;
                break;
            }
        }
        if (contactToRemove != null) {
            contacts.remove(contactToRemove);
            System.out.println("Contact removed successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void searchContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println(contact);
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void updateContact(String contactID, String newPhoneNumber, String newEmail) {
        for (Contact contact : contacts) {
            if (contact.getContactID().equals(contactID)) {
                contact.setPhoneNumber(newPhoneNumber);
                contact.setEmail(newEmail);
                System.out.println("Contact updated successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void displayAllContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}

public class ContactListApplication {
    public static void main(String[] args) {
        ContactList contactList = new ContactList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Contact List Application:");
            System.out.println("1. Add a new contact");
            System.out.println("2. Remove a contact by contactID");
            System.out.println("3. Search for a contact by name");
            System.out.println("4. Update a contact's phone number and email");
            System.out.println("5. Display all contacts");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter contactID: ");
                    String contactID = scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    Contact contact = new Contact(contactID, name, phoneNumber, email);
                    contactList.addContact(contact);
                    break;
                case 2:
                    System.out.print("Enter contactID: ");
                    String removeContactID = scanner.nextLine();
                    contactList.removeContactByID(removeContactID);
                    break;
                case 3:
                    System.out.print("Enter name: ");
                    String searchName = scanner.nextLine();
                    contactList.searchContactByName(searchName);
                    break;
                case 4:
                    System.out.print("Enter contactID: ");
                    String updateContactID = scanner.nextLine();
                    System.out.print("Enter new phone number: ");
                    String newPhoneNumber = scanner.nextLine();
                    System.out.print("Enter new email: ");
                    String newEmail = scanner.nextLine();
                    contactList.updateContact(updateContactID, newPhoneNumber, newEmail);
                    break;
                case 5:
                    contactList.displayAllContacts();
                    break;
                case 6:
                    System.out.println("Exiting");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}