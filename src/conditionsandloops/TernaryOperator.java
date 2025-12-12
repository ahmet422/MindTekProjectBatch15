package conditionsandloops;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        // ask a user to enter a number and print if its odd or even
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num = input.nextInt();
        String res = num%2 == 0 ? "even" : "odd";

//        if(num%2 == 0) res = "even";
//        else res = "odd";
        System.out.println(res);
    }
}
