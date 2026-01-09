package arrays;

import java.util.Arrays;

public class FullNames {
    public static void main(String[] args) {
        String[] fullNames = {"Adam Smith", "Karl Marx", "Dan Brown", "Bertrand Russel"};
        // create 2 arrays: fnames, lnames
        String[] fnames = new String[fullNames.length];
        String[] lnames = new String[fullNames.length];
        for(int i =0; i < fullNames.length; i++){
            fnames[i] = fullNames[i].substring(0,fullNames[i].indexOf(" "));
            lnames[i] = fullNames[i].substring(fullNames[i].indexOf(" ")).trim();
        }
        System.out.println(Arrays.toString(fnames));
        System.out.println(Arrays.toString(lnames));
    }
}
