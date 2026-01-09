package arrays;

import java.util.Arrays;

public class ForEachIntro {
    public static void main(String[] args) {
        String[] words = {"java", "c#", "python", "html"};
        double[] prices = {12.3,43.1,11.2,22.56};

        // print every element in words and then in prices
//        for(String text : words) System.out.println(text);
//        for(double el : prices) System.out.println(el);

        // create a copy of words and a copy of prices
//        String[] copyOfWords = words;
//        System.out.println(Arrays.toString(words));
//        System.out.println(Arrays.toString(copyOfWords));
//        copyOfWords[1] = "c++";
//        System.out.println("----");
//        System.out.println(Arrays.toString(copyOfWords));
//        System.out.println(Arrays.toString(words));
//        System.out.println(words);
//        System.out.println(copyOfWords);
//        String[] anothercopy = words;
//        anothercopy[0] = "css";
//        System.out.println("**********");
//        System.out.println(Arrays.toString(anothercopy));
//        System.out.println(Arrays.toString(copyOfWords));
//        System.out.println(Arrays.toString(words));

        String[] copyOfWords = new String[words.length];
        for(int i = 0; i < copyOfWords.length; i++){
            copyOfWords[i] = words[i];
        }

        double[] copyOfPrices = new double[prices.length];
        for(int i = 0; i < copyOfPrices.length; i++){
            copyOfPrices[i] = prices[i];
        }
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(copyOfPrices));

        double[] anotherCopyOfPrices = Arrays.copyOf(prices, prices.length);
        System.out.println(Arrays.toString(anotherCopyOfPrices));
    }
}
