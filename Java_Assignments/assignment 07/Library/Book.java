package Library;

public class Book
{
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author)
    {
        this.title = "Harry Potter";
        this.author = "JK Rowling";
        this.available = true;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public boolean isAvailable()
    {
        return available;
    }

    public void setAvailable(boolean available)
    {
        this.available = available;
    }
}

/*

                                Book book = new Book("Title", "Author");

                                Patron patron = new Patron("Tanay", 7);

                                // display book information
                                System.out.println("Book Title: " + book.getTitle());
                                System.out.println("Book Author: " + book.getAuthor());
                                System.out.println("Book Availability: " + (book.isAvailable() ? "Available" : "Not Available"));

                                // patron information display
                                System.out.println("Patron Name: " + patron.getName());
                                System.out.println("Patron ID: " + patron.getMemberId());

                                // calculate late fees no of days
                                int daysLate = 5;
                                double lateFees = Latefees.calculateLateFees(daysLate);
                                System.out.println("Late Fees for " + daysLate + " days late: Rs" + lateFees);

 */