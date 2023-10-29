class Circle implements Cloneable{
    private int radius;

    public Circle(){
        radius = 1;
    }

    public Circle(int radius){
        this.radius = radius;
    }

    public double calcArea(){
         return Math.PI * radius * radius;
    }

    public double calcPeri() {
        return 2 * Math.PI * radius;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class CloneExample {
    public static void main(String[] args) throws CloneNotSupportedException{
        Circle c1 = new Circle(2);
        Circle c2 = (Circle)c1.clone();
        System.out.println(c2.calcArea());
    }
}
