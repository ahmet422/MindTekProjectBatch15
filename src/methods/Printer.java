package methods;

public class Printer {

    /**
     * This method just prints hardcoded message
     * @Returns: nothing
     * @Parameters: no parameters
     */
    public void printGreeting(){
        System.out.println("Hello from your first method!");
    }

    /**
     * Prints 3 lines: dashes on top and bottom, and given text
     * @param text
     */
    public void printMessage(String text){
        System.out.println("--------");
        System.out.println(text);
        System.out.println("--------");
    }


    public void printMessage(String text1, String text2){
        System.out.println("First parameter: " +  text1);
        System.out.println("Second parameter: " + text2);
    }

    public String generateFullName(String fname, String lname){
        return fname + " " + lname;
    }
}
