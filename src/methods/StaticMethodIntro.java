package methods;

public class StaticMethodIntro {
    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {

        // call a non static method:
        Printer obj = new Printer();
        obj.printMessage("html");

        // call static method:
        Printer.printGreeting();
        Integer.min(12,45);
    }
}
