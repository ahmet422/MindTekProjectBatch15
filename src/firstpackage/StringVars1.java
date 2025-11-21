package firstpackage;

import java.util.Scanner;

public class StringVars1 {
    public static void main(String[] args) {
        // Use scanner to read from console
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name= input.next();
        System.out.println("What is your lastname?");
        String surname = input.next();
        // String variables
        System.out.println("Good evening Mr."+name + " " + surname);
        System.out.println("What day is today?");
        String day=input.next();
        System.out.println("Today is "+day);


    }
}
