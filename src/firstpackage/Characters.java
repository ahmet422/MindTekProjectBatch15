package firstpackage;

import java.sql.SQLOutput;

public class Characters {
    public static void main(String[] args) {
      //type nameVar = value;
        char letter = 'a';
        char symbol = '$';
        char digit = '6';
        char empty_space = ' ';
        System.out.println(letter);
        System.out.println(symbol + 0);  // 'a' + 0
        String dollar_sign = "$";
        double price = 15.65;
        String totalCost = dollar_sign  + price; // concatenation
        System.out.println(totalCost);
    }
}
