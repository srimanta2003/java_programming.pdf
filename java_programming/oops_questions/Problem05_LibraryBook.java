import java.util.ArrayList;
public class Problem05_LibraryBook {
    static class Book {
        String title;
        String author;
        boolean available = true;
        Book(String t,String a){ title=t; author=a; }
        public String toString(){ return title + " by " + author + (available?" [available]":" [loaned]"); }
    }
    static class Library {
        ArrayList<Book> books = new ArrayList<>();
        void add(Book b){ books.add(b); }
        boolean borrow(String title){
            for(Book b: books) if(b.title.equals(title) && b.available){ b.available=false; return true; }
            return false;
        }
        void list(){ for(Book b: books) System.out.println(b); }
    }
    public static void main(String[] args){
        Library lib = new Library();
        lib.add(new Book("OO Java","Kumar"));
        lib.add(new Book("Data Structures","Sen"));
        lib.list();
        lib.borrow("OO Java");
        lib.list();
    }
}