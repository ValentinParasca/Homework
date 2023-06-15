package LibraryBooks;

public class Book {
    private String name;
    private int nrPages;
    public Book(String name, int nrPages) {
        this.name = name;
        this.nrPages = nrPages;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNrPages() {
        return nrPages;
    }

    public void setNrPages(int nrPages) {
        this.nrPages = nrPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", nrPages=" + nrPages +
                '}';
    }
}
