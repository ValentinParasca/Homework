package LibraryBooks;

public class LibraryCatalog {
        int i = 0;
        Book[] books = new Book[3];
        public void addBook(Book book){
            this.books[i] = book;
            i++;
        }
        public void deleteBook(){
            i--;
            this.books[i] = null;

        }

        public void listBook(){
            for(Book book: books){
                if(book != null){
                    System.out.println(book.toString());
                }
            }
        }

    }
