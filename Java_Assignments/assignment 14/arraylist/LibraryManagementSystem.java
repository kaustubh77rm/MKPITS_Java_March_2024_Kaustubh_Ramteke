package assgn_14;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String ISBN;
    private String title;
    private String author;
    private int yearPublished;

    public Book(String ISBN, String title, String author, int yearPublished) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                '}';
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void removeBookByISBN(String ISBN) {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }

    public void searchBookByISBN(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void displayBooksAfterYear(int year) {
        for (Book book : books) {
            if (book.getYearPublished() > year) {
                System.out.println(book);
            }
        }
    }

    public void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Library Management System:");
            System.out.println("1. Add a new book");
            System.out.println("2. Remove a book by ISBN");
            System.out.println("3. Search for a book by ISBN");
            System.out.println("4. Display all books published after a certain year");
            System.out.println("5. Display all books");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter isbn: ");
                    String ISBN = scanner.nextLine();
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter year published: ");
                    int yearPublished = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    Book book = new Book(ISBN, title, author, yearPublished);
                    library.addBook(book);
                    break;
                case 2:
                    System.out.print("Enter ISBN: ");
                    String removeISBN = scanner.nextLine();
                    library.removeBookByISBN(removeISBN);
                    break;
                case 3:
                    System.out.print("Enter ISBN: ");
                    String searchISBN = scanner.nextLine();
                    library.searchBookByISBN(searchISBN);
                    break;
                case 4:
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    library.displayBooksAfterYear(year);
                    break;
                case 5:
                    library.displayAllBooks();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}