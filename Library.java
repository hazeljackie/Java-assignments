public class Library {

    private Book[] books = new Book[10];
    private int count = 0;

    public void addBook(Book b) {
        books[count++] = b;
    }

    public void issueBook(String isbn) {
        for (Book b : books) {
            if (b != null && b.getIsbn().equals(isbn)) {
                b.issueBook();
            }
        }
    }

    public void returnBook(String isbn) {
        for (Book b : books) {
            if (b != null && b.getIsbn().equals(isbn)) {
                b.returnBook();
            }
        }
    }

    public void listAvailableBooks() {
        for (Book b : books) {
            if (b != null && !b.isIssued()) {
                b.displayBookInfo();
            }
        }
    }
}
