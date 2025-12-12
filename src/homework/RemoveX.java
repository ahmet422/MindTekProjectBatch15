package homework;

import java.util.Scanner;

public class RemoveX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a word: ");
        String text = input.next();
        text = text.replaceAll("x", "");
        text = text.replaceAll("X", "");
        System.out.println("After all x letters removed: " + text);
    }
}
