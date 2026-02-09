class Book {
    boolean issued = false;

    void issueBook() {
        if (!issued) {
            issued = true;
            System.out.println("Book Issued");
        } else {
            System.out.println("Already Issued");
        }
    }
}

public class LibraryExample {
    public static void main(String[] args) {
        Book b = new Book();
        b.issueBook();
        b.issueBook();
    }
}
