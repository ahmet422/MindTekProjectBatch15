package arraylist;

import oop.Book;

import java.util.ArrayList;
import java.util.Arrays;

public class Pr2 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("office","books","shelves","laptops","cables"));
        // make each word in words list all uppercase : OFFICE
        for(int i = 0; i < words.size(); i++){
            words.set(i,words.get(i).toUpperCase());
        }
        System.out.println(words);

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(12,45,67,23,89,99));
        // add 10 to every even el in nums, -10 to every odd el
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) % 2 == 0) nums.set(i,nums.get(i)+10);
            else nums.set(i,nums.get(i)-10);
        }
        System.out.println(nums);

        Book b1 = new Book("1984", "George Orwell", 120);

        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee", 281);
        Book b3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);
        Book b4 = new Book("Moby Dick", "Herman Melville", 635);
        ArrayList<Book> books = new ArrayList<>(Arrays.asList(b1,b2,b3,b4));
        // add 12 to each pageAmount of every book in books
        for(Book el : books) el.setPageAmount(el.getPageAmount()+12);
        System.out.println(books);
    }
}
