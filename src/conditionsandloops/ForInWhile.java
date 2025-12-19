package conditionsandloops;

import java.util.Scanner;

public class ForInWhile {
    public static void main(String[] args) {
        // keep asking a user to enter beginning and ending numbers,
        // Ask if user wants to continue yes or no.
        // each time print all nums from beginning to ending.
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Do you want to write numbers: yes or no");
            String answer = input.next();
            if(answer.equals("start-over")) continue; // go to the next cycle/iteration
            if(answer.equals("no")) break; // exit from loop
            System.out.println("Beginning number: ");
            int num = input.nextInt();
            System.out.println("Finishing number: ");
            int finishNum = input.nextInt();
            for(int i = num; i <= finishNum; i++){
                System.out.println(i);
            }
        }

        System.out.println("Finished!");
    }
}
