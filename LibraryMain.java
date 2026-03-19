public class LibraryMain {

    public static void main(String[] args) {

        Library lib = new Library();

        Book b1 = new Book("Java","Joseph","111");
        Book b2 = new Book("DBMS","Ann","222");
        Book b3 = new Book("Networks","Mike","333");

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        lib.issueBook("111");
        lib.returnBook("222");

        lib.listAvailableBooks();
    }
}
