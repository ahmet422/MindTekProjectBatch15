package conditionsandloops;

import java.util.Scanner;

public class WhichIsSmaller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num1 = input.nextInt();
        System.out.println("Type a number: ");
        int num2 = input.nextInt();
        // print smaller number : 8 and 3 -> 3
        int small = num1 < num2 ? num1 : num2;
        System.out.println(small);

    }
}
