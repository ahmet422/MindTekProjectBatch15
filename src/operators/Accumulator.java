package operators;

import java.util.Scanner;

public class Accumulator {
    public static void main(String[] args) {
        // ask a user to enter 4 numbers, print the total sum
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Num");
        sum = sum + input.nextInt();

        System.out.println("Num");
        sum = sum + input.nextInt();

        System.out.println("Num");
        sum = sum + input.nextInt();

        System.out.println("Num");
        sum = sum + input.nextInt();
        System.out.println("Total is " + sum);

    }
}
