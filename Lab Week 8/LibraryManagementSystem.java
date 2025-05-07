// Base class for all library items
class LibraryItem {
    protected String title;
    protected String author;
    protected int publicationYear;

    public LibraryItem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Book class extends LibraryItem
class Book extends LibraryItem {
    protected String ISBN;
    protected int numberOfPages;

    public Book(String title, String author, int publicationYear, String ISBN, int numberOfPages) {
        super(title, author, publicationYear);
        this.ISBN = ISBN;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("ISBN: " + ISBN);
        System.out.println("Number of Pages: " + numberOfPages);
    }
}

// Magazine class extends LibraryItem
class Magazine extends LibraryItem {
    protected int issueNumber;
    protected String month;
    protected String editor;

    public Magazine(String title, String author, int publicationYear, int issueNumber, String month, String editor) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
        this.month = month;
        this.editor = editor;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Month: " + month);
        System.out.println("Editor: " + editor);
    }
}

// ReferenceBook class extends Book
class ReferenceBook extends Book {
    private String fieldOfStudy;
    private boolean isLendable;

    public ReferenceBook(String title, String author, int publicationYear, String ISBN, int numberOfPages, String fieldOfStudy, boolean isLendable) {
        super(title, author, publicationYear, ISBN, numberOfPages);
        this.fieldOfStudy = fieldOfStudy;
        this.isLendable = isLendable;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Field of Study: " + fieldOfStudy);
        System.out.println("Lendable: " + (isLendable ? "Yes" : "No"));
    }
}

// Main class to run the program
public class LibraryManagementSystem {
    public static void main(String[] args) {

        LibraryItem[] items = new LibraryItem[3];

        items[0] = new Book("Effective Java", "Joshua Bloch", 2018, "9780134685991", 416);
        items[1] = new Magazine("TIME", "Various", 2024, 202, "April", "Edward Felsenthal");
        items[2] = new ReferenceBook("Oxford English Dictionary", "Oxford University Press", 2020, "9780199573158", 2112, "Linguistics", false);

        System.out.println("Library Items Information:\n");
        for (LibraryItem item : items) {
            item.displayInfo();
            System.out.println("----------------------------");
        }
    }
}
