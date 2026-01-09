package oop;

public class Main1 {
    public static void main(String[] args) {
        Car car0 = new Car(2001,"black");
        car0.print();

        Car car1 = new Car();
        car1.year = 2023;
        car1.color = "gray";
        car1.print();

        Car car2 = new Car();
        car2.year = 2000;
        car2.color = "green";
        car2.print();

        Car car3 = new Car();
        car3.year = 2015;
        car3.color = "red";
        car3.print();

        Car car4 = car3;
        car3.year = 1999;
        car4.print();
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);




    }
}
