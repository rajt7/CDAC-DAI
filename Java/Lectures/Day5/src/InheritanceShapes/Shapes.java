package InheritanceShapes;

abstract class Polygon {
    public abstract double calcArea();
    public abstract double calcPeri();
}

class Circle extends Polygon{
    private double radius;

    // default constructor
    Circle(){
        radius = 1;
    }

    // Parameterized Constructo
    Circle(double radius){
        this.radius = radius;
    }

    public double calcArea(){
         return Math.PI * radius * radius;
    }

    public double calcPeri() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Polygon{
    private double length;
    private double breadth;

    Rectangle() {
        length = 1;
        breadth = 1;
    }

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double calcArea() {
        return length*breadth;
    }

    public double calcPeri() {
        return 2*(length + breadth);
    }
}

class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public double calcArea(){
        return super.calcArea();
    }

    public double calcPeri() {
        return super.calcPeri();
    }
}

public class Shapes {
    public static void main(String[] args){
        // Square a = new Square(5);
        Rectangle r = new Rectangle(10, 5);
        System.out.println("Area of rectangle is: " + r.calcArea());
        System.out.println("Area of rectangle is: " + r.calcPeri());
    }
}
