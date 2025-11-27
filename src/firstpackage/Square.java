package firstpackage;

import java.util.Scanner;

public class Square {
    /**
     * This code asks a user to enter a length of square
     * prints perimeter and area
     * @param args
     */
    public static void main(String[] args) {
        // ask a user to type length of a side of square (double)
        //  print perimeter and area of given square
        int number = 8;
        Scanner input = new Scanner(System.in);
        System.out.println("Type length of square");
        double length = input.nextDouble();
        System.out.println("Perimeter: " + (length + length + length + length));
        double area = length * length;
        System.out.println("Area: " + area);

    }
}
