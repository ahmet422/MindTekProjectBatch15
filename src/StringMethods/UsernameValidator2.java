package StringMethods;

import java.util.Scanner;

public class UsernameValidator2 {
    public static void main(String[] args) {
        // ask a user to create a new username
        // all usernames must have minimum 5 chars
        // check if given username is valid or not.
        // Valid username:
        // 1 Must have 5 or more letters
        // 2 The last character must be a vowel letter : a, e, o, i, u
        // If not valid print: This username is not valid. It must have at least 5 characters.
        // otherwise print: username is accepted.
        // Hello -> valid, computer -> not valid


        Scanner input = new Scanner(System.in);
        System.out.println("Type a new username:");
        String uname = input.next();
        char lastLetter = uname.charAt(uname.length()-1);
        boolean hasGoodLength = uname.length() >= 5;
        boolean isVowel = lastLetter == 'a' || lastLetter == 'e' || lastLetter == 'u' || lastLetter == 'o' || lastLetter == 'i';
        boolean isValid = hasGoodLength && isVowel;
        if(isValid) System.out.println("username is accepted");
        else System.out.println("This username is not valid. It must have at least 5 characters and end with a vowel letter.");
    }
}
