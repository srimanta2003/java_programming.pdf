import java.util.*;
public class Q11_Association {
    static class Book { String title; Book(String t){ title=t; } }
    static class Library {
        String name; List<Book> books;
        Library(String n, List<Book> books){ name=n; this.books=books; }
        void list(){
            System.out.println(name + " has:");
            for(Book b: books) System.out.println(" - " + b.title);
        }
    }
    public static void main(String[] args){
        List<Book> list = new ArrayList<>();
        list.add(new Book("Java OOP"));
        list.add(new Book("DSA"));
        Library lib = new Library("CityLib", list);
        lib.list();
    }
}
