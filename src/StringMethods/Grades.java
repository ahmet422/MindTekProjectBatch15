package StringMethods;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your exam score: ");
        int givenScore = input.nextInt();

        if(givenScore>=80 && givenScore<=100){
            System.out.println("Excellent score");
            System.out.println("A");
        }else if(givenScore>=60 && givenScore<80){
            System.out.println("Doing Good!");
            System.out.println("B");
        }else if(givenScore>=40 && givenScore<60){
            System.out.println("Not that good!");
            System.out.println("C");
        }else if(givenScore>=0 && givenScore<40) System.out.println("F");
        else System.out.println("Invalid score!");


    }
}
