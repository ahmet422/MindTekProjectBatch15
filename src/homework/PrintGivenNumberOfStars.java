package homework;

import java.util.Scanner;

public class PrintGivenNumberOfStars {
    public static void main(String[] args) {
        // keep asking a user to enter a number until they enter exit
        // print amount of * in one line

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("\nType a number or type exit to finish: ");
            String givenText = input.next();
            if(givenText.equals("exit")) break;
            int givenNum = Integer.parseInt(givenText);
            System.out.println("Given number is: " + givenNum);
            System.out.println("---");
            while(givenNum > 0){
                System.out.print("*");
                givenNum--;
            }
        }

        System.out.println("End");

    }
}
