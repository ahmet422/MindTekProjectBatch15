package methods;

public class Main {
    public static void main(String[] args) {
        // create object: Printer
        // className objName = new className();
        Printer obj = new Printer();
        // call method -> obj.methodName();
        System.out.println("Before calling method");
        obj.printGreeting();
        System.out.println("After calling method");

        obj.printMessage("Learning java is fun!");
        System.out.println("*********");
        obj.printMessage("Fun but not that easy!");
    }
}
