package firstpackage;

import java.util.Scanner;

public class GetNumber {
    public static void main(String[] args) {
        // ask a user to give any int number
        // print the last 2 digits
        // 567 -> 76, 75432 -> 23, 10 -> 01
        //...
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num = input.nextInt() % 100;

        System.out.println("last 2 digits: " + num);
        System.out.println("last 2 digits with reversed order: " + (num%10) + (num/10%10));
    }
}
