package Day5_Assignment;

class Vehicle implements Cloneable {
    private String vehicleNumber;
    private String name;
    private double price;

    public Vehicle(String number, String name, double price){
        this.vehicleNumber = number;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Vehicle Number:" + vehicleNumber + "\nName: " + name + "\nPrice: " + price;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}


public class Q2 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Vehicle v1 = new Vehicle("MH12AB2345", "Mustang", 25000.32);
        Vehicle v2 = (Vehicle)v1.clone();
        System.out.println(v2.clone());

    }
}
