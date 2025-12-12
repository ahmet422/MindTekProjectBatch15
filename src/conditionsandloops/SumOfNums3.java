package conditionsandloops;

import java.util.Scanner;

public class SumOfNums3 {
    public static void main(String[] args) {
        // keep asking for a new number until user enters 0
        // print sum of all given numbers
        Scanner input = new Scanner(System.in);
        int sum = 0;

        while(true){
            System.out.println("Type a number: ");
            int givenNum = input.nextInt();
            if(givenNum == 0) break;
            sum = sum + givenNum;
        }

        System.out.println("The total sum of all given numbers is: " + sum);
    }
}
