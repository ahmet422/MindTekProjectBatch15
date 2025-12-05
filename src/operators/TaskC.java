package operators;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Temperature: ");
        int temp = input.nextInt();

        if(temp < -50 || temp > 150){
            System.out.println("Temperature is outside of realistic range!");
        }else{
            // if tem is between 70 and 90 :
            if(temp >= 70 && temp <= 90) System.out.println("Perfect outdoor weather!");
            else System.out.println("Weather is not ideal today");
        }
    }
}
