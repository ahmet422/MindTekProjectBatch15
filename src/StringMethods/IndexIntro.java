package StringMethods;

public class IndexIntro {
    public static void main(String[] args) {
        // index is special number that indicates where some char
        // is located. Index ALWAYS starts from 0
        // index       0123456789
        String book = "Java Fundamentals";
        System.out.println(book);
        System.out.println("first char: " + book.charAt(0));
        System.out.println("last char: " + book.charAt(12)); // not good
        int lastIndex = book.length() - 1;
        System.out.println("last char: " + book.charAt(lastIndex));
        System.out.println("last char: " + book.charAt(book.length() - 1));
        char letter = book.charAt(0);
        int size = book.length();


    }
}
