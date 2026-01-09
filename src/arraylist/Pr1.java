package arraylist;

import oop.Book;

import java.util.ArrayList;
import java.util.Arrays;

public class Pr1 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(12,56,89,32,45,23,67,45));

        // print each el from nums in a new line
//        for(int i = 0; i < nums.size(); i++) System.out.println(nums.get(i));
//        for(int el : nums) System.out.println(el);

        ArrayList<String> words = new ArrayList<>(Arrays.asList("office","books","shelves","laptops","cables"));
        System.out.println(words);
//        for(int i = 0; i < words.size(); i++) System.out.println(words.get(i));
//        for(String el : words) System.out.println(el);
        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('a','b','k','o'));
        System.out.println(letters);
//        for(char el : letters) System.out.println(el);
        ArrayList<Book> books = new ArrayList<>();
        Book b1 = new Book("Atomic Habits", "K.James", 120);
        Book b2 = new Book("1984", "G.Orwell", 120);
        Book b3 = new Book("Peace and War", "L.Tolstoy", 900);
        books.addAll(Arrays.asList(b1,b2,b3));
        System.out.println(books);
        for(Book el : books) System.out.println(el);


    }
}
