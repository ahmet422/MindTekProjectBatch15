package arrays;

import java.util.Arrays;

public class Separation {
    public static void main(String[] args) {
        String[] items = {"apple-green-sweet","cherry-red-sour","melon-yellow-juicy","kiwi-green-candylike"};
        // create 3 arrays : fruits, colors, tastes
        String[] fruits = new String[items.length];
        String[] colors = new String[items.length];
        String[] tastes = new String[items.length];

        for(int i = 0; i < items.length; i++){
            String el = items[i];
            fruits[i] = el.substring(0,el.indexOf("-"));;
            colors[i] = el.substring(el.indexOf("-")+1, el.lastIndexOf("-"));
            tastes[i] = el.substring(el.lastIndexOf("-")+1);
        }

        System.out.println(Arrays.toString(fruits) + "\n" + Arrays.toString(colors) + "\n" + Arrays.toString(tastes));

    }
}
