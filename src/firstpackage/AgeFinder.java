package firstpackage;

import java.util.Scanner;

public class AgeFinder {
    public static void main(String[] args) {
        // Ask a user what year they were born.
        // print their age.
        Scanner input = new Scanner(System.in);
        System.out.println("What year you were born: ");
        int givenYear = input.nextInt();
        int age = 2025 - givenYear;
        System.out.println("You are " + age + " years old!");

    }
}
