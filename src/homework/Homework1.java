package homework;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your name:");
        String userName = input.next();
        System.out.println("Your age:");
        String age = input.next();
        System.out.println("Hello " + userName + ", you are " + age + " years old!");
    }
}
