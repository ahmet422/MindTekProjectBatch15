package oop;

public class Square extends Shape{
    private double side;

    public Square(double side) {
        super.setName("Square");
        this.side = side;
    }

    @Override
    public double calcArea() {
        return side*side;
    }

    @Override
    public double calcPerimeter() {
        return 4*side;
    }

    @Override
    public void printAngles() {
        System.out.println("4 angles in Square");
    }

    @Override
    public void printName() {
        System.out.println(this.getName());
    }
}
