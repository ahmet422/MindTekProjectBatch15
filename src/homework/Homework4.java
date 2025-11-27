package homework;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type any number: ");
        int givenNum = input.nextInt();
        System.out.println("The last digit is: " + givenNum % 10);

    }
}
