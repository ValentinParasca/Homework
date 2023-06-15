package LibraryBooks;
public class Main {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();

        Novel novel1 = new Novel("The Catcher in the Rye", 280, "Coming-of-age");
        ArtAlbums album1 = new ArtAlbums("The Art of Photography", 200, "High");
        Book book = new Book("To Kill a Mockingbird", 336);

        catalog.addBook(novel1);
        catalog.addBook(album1);
        catalog.addBook(book);
        catalog.listBook();
        System.out.println(" ");
        catalog.deleteBook();
        catalog.listBook();
    }

}