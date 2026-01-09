package oop;

public class Main3 {
    public static void main(String[] args) {
        Book b1 = new Book("War and Peace","L. Tolstoy", 900);
        Book b2 = new Book("1984","G. Orwell", 120);


        System.out.println(b1);
        System.out.println(Book.count);


        // Can you create a immutable class?
        // class that does not allow its fields to be changed
    }
}
