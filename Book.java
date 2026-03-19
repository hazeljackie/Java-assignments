public class Book {

    private String title;
    private String author;
    private String isbn;
    private boolean isIssued;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isIssued = false;
    }

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
        }
    }

    public void returnBook() {
        isIssued = false;
    }

    public void displayBookInfo() {
        System.out.println(title + " | " + author + " | " + isbn +
                " | " + (isIssued ? "Issued" : "Available"));
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isIssued() {
        return isIssued;
    }
}
