package methods;

public class Main1 {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        myPrinter.printMessage("m1","m2");

        System.out.println(myPrinter.generateFullName("Akbar","Ularbekov"));
        System.out.println(myPrinter.generateFullName("Ahmet", "Tach"));
    }
}
