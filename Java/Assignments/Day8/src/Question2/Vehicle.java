package Question2;

public class Vehicle implements Comparable<Vehicle>{
    private int vehicleNumber;
    private String name;
    private double cost;

    public Vehicle(int number, String name, double cost){
        this.vehicleNumber = number;
        this.name = name;
        this.cost = cost;
    }

    public void display() {
        System.out.println("Vehicle Number: " + vehicleNumber + ", Name: " + name + ", Cost: " + cost);
    }

    @Override
    public int compareTo(Vehicle o) {
        if(o.cost < this.cost)
            return 1;
        else if(o.cost > this.cost)
            return -1;
        else
            return 0;
    }
}
