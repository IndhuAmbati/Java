import java.util.*;
abstract class Shape {
    int a;
    int b;
 Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }
abstract void printArea();
}
class Rectangle extends Shape {
    Rectangle(int a, int b) {
        super(a, b);
        
    }
    void printArea() {
        System.out.println("Area of Rectangle is: " + (a * b));
    }
}
class Triangle extends Shape {
    Triangle(int a, int b) {
        super(a, b);
    }
    void printArea() {
        System.out.println("Area of Triangle is: " + (0.5 * a * b));
    }
}
class Circle extends Shape {
    Circle(int r) {
        super(r, 0); 
    }
    void printArea() {
        System.out.println("Area of Circle is: " + (3.14 * a * a)); 
    }
}
class Exp8 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        r.printArea(); 
        Triangle t = new Triangle(30, 40);
        t.printArea();  
        Circle c = new Circle(1);
        c.printArea();  
    }
}
