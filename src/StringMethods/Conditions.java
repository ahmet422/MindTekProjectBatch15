package StringMethods;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your age: ");
        int givenAge = input.nextInt();

        if(givenAge<=12 && givenAge >= 0) System.out.println("Child");
        else if(givenAge<=19 && givenAge>=13) System.out.println("Teenager");
        else if(givenAge<=60 && givenAge>=20) System.out.println("Adult");
        else if(givenAge<=120 && givenAge >=61) System.out.println("Senior");
        else System.out.println("Not valid age!");

        System.out.println("The end!");
    }
}
