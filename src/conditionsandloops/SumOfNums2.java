package conditionsandloops;

import java.util.Scanner;

public class SumOfNums2 {
    public static void main(String[] args) {
        // keep asking for a new number until user enters 0
        // print sum of all given numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number: ");
        int givenNum = input.nextInt();
        int sum = 0;
        while(givenNum != 0){
            sum = sum + givenNum;
            System.out.println("Type a number: ");
            givenNum = input.nextInt();
        }
        System.out.println("The total sum of all given numbers is: " + sum);
    }
}
