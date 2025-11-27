package operators;

import java.util.Scanner;

public class IfElseIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What year is this year? ");
        int givenYear = input.nextInt();
        // userIsRight is true if givenYear is 2025
        boolean userIsRight = givenYear == 2025;
        // if(){}
//        if(userIsRight){
//            System.out.println("From if block");
//            System.out.println("You are right!");
//        }

        // if(){} else{}
        if(userIsRight){
            System.out.println("From if block");
            System.out.println("You are right!");
        }else{
            System.out.println("From else block");
            System.out.println("You are wrong, it is 2025!");
        }

        System.out.println("End!");

    }
}
