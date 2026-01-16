package exceptions;

import java.util.Scanner;

public class ExceptionsIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a num:");
        int num1 = input.nextInt();

        System.out.println("Type another num:");
        int num2 = input.nextInt();

        try{
            System.out.println("Division of " + num1 + "/" + num2 + " is: ");
            System.out.println(num1/num2);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Sorry division is not accepted");
        }
        System.out.println("End!");
    }
}
