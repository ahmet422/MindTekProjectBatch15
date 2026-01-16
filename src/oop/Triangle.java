package oop;

public class Triangle extends Shape{

    private double side1, side2, base, height;

    public Triangle(double side1, double side2, double base, double height) {
        super.setName("Triangle");
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return base * height/2;
    }

    @Override
    public double calcPerimeter() {
        return side1 + side2 + base;
    }

    @Override
    public void printAngles() {
        System.out.println("3 angles in Triangle");
    }

    @Override
    public void printName() {
        System.out.println(this.getName());
    }
}
