package StringMethods;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // ask a user any number, if num is divisible:
        // by 3 and 5 -> print FizzBuzz
        // by 3 -> print Fizz
        // by 5 -> print Buzz
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num = input.nextInt();

        if(num%3 == 0 && num%5 == 0) System.out.println("FizzBuzz");
        else if(num%5 == 0) System.out.println("Buzz");
        else if(num%3 == 0) System.out.println("Fizz");
        else System.out.println("Not divisible by 3 or 5");
    }
}
