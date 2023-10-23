package Question2;

import java.util.*;

public class Q2 {
    public static void main(String[] args){
        Set<Vehicle> vehicles = new TreeSet<>();

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");
        int choice = 0;
        while(choice != 5){
            System.out.println("\n1.Add Vehicle Record.\n2.Display all Vehicles\n3.Display details of maximum and minimum cost vehicle\n4.Exit\nChoice: ");
            choice = sc.nextInt();

            int number;
            String name;
            double cost;

            switch(choice){
                case 1:
                    System.out.println("Enter the vehicle number: ");
                    number = sc.nextInt();
                    System.out.println("Enter the vehicle name: ");
                    name = sc.next();
                    System.out.println("Enter the price of vehicle: ");
                    cost = sc.nextDouble();

                    vehicles.add(new Vehicle(number, name, cost));
                    break;
                case 2:
                    for(Vehicle v: vehicles)
                        v.display();
                    break;
                case 3:
                    ArrayList<Vehicle> vehiclesArray = new ArrayList<>(vehicles);
                    Collections.sort(vehiclesArray);

                    Vehicle min_cost_vehicle = vehiclesArray.get(0);
                    Vehicle max_cost_vehicle = vehiclesArray.get(vehiclesArray.size() - 1);

                    System.out.println("Minimum Cost vehicle details");
                    min_cost_vehicle.display();
                    System.out.println("Maximum Cost vehicle details");
                    max_cost_vehicle.display();
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Wrong choice!!!");                   
            }
        
        }
    }
}
