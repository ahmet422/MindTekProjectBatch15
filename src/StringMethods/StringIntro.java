package StringMethods;

import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        // String is Reference type variable
        String color = "red";
        System.out.println(color);
        //  "yellow" -> "YELLOW"
        color = color.toUpperCase();
        System.out.println(color.toUpperCase());
        System.out.println(color);
        // get the size-length of string
        int size = color.length();
        System.out.println("Size of color: " + color.length());
    }
}
