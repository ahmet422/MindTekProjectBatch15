package homework;

import java.util.Scanner;

public class IceCream {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Month: ");
        int givenMonth = input.nextInt();

        boolean isWinter = givenMonth==12 || givenMonth == 1 || givenMonth== 2;
        boolean isSpring = givenMonth==3 || givenMonth == 4 || givenMonth== 5;
        boolean isSummer = givenMonth==6 || givenMonth == 7 || givenMonth== 8;
        boolean isFall = givenMonth==9 || givenMonth == 10 || givenMonth== 11;

        if(isWinter) System.out.println("Chocolate");
        else if (isSpring) System.out.println("Strawberry");
        else if(isSummer) System.out.println("Vanilla");
        else if(isFall) System.out.println("Pumpkin");
        else System.out.println("Not valid month!");
    }
}
