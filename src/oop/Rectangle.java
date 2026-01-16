package oop;

public class Rectangle extends Shape{

    private double side1, side2;

    public Rectangle(double side1, double side2) {
        super.setName("Rectangle");
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calcArea() {
        return side1*side2;
    }

    @Override
    public double calcPerimeter() {
        return 2 * (side1 + side2);
    }

    @Override
    public void printAngles() {
        System.out.println("4 angles in Perimeter");
    }

    @Override
    public void printName() {
        System.out.println(this.getName());
    }
}
