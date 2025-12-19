package homework;

import java.util.Scanner;

public class PrintStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number: ");
        int givenNum = input.nextInt();
        String star = "";

        while(givenNum > 0){
            star = star + "*";
            System.out.println(star);
            givenNum--;
        }
    }
}
