package arrays;

import java.util.Arrays;

public class ArraysHoldingStrings {
    public static void main(String[] args) {
        // type[] name = new type[size];
        // type[] name = new type[]{el1, el2, el3};
        // type[] name = {el1, el2, el3};
        String[] colors = {"black", "white", "red", "orange"};
        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);
        colors[0] = "green";
        System.out.println(Arrays.toString(colors));

        String[] objects = new String[4];
        System.out.println(Arrays.toString(objects));
        System.out.println(objects.length);

        double[] decimals = new double[7];
        System.out.println(Arrays.toString(decimals));

        char[] letters = new char[3];
        System.out.println(Arrays.toString(letters));

        boolean[] barray = new boolean[4];
        System.out.println(Arrays.toString(barray));


    }
}
