package oop;

public class Car {

    // fields
    int year;
    String color;

    // constructor
    public Car(){
    }

    public Car(int year, String color){
        this.year = year;
        this.color = color;
    }

    // methods
    public void print(){
        System.out.println("Car: year-" +
                "" + year + ", color-" + color);
    }
}
