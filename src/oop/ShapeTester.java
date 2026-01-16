package oop;

import java.util.ArrayList;

public class ShapeTester {
    public static void main(String[] args) {
//        Shape obj = new Shape();
        Triangle tr1 = new Triangle(2,3,2,2);
        Square s1 = new Square(5);
        Circle c1 = new Circle(2);
        c1.printName();
        c1.printAngles();
//        NamePrinter np = new NamePrinter();
        NamePrinter np = new Circle(3);
        np.printName();
        Book b1 = new Book("as","asf",12);

        ArrayList<Shape> list = new ArrayList<>();
        list.add(s1);
        list.add(tr1);
        list.add(c1);
//        list.add(obj);

        System.out.println("--------");
        for(Shape el : list){
            el.printName();
        }

    }
}
