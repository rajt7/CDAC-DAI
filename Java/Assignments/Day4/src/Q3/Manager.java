package Q3;

public class Manager extends Employee {
    private double petrol_allowance;
    private double food_allowance;
    private double other_allowance;

    public Manager(int id, String name, double salary){
        super(id, name, salary);
        this.petrol_allowance = 0.08*salary;
        this.food_allowance = 0.12*salary;
        this.other_allowance = 0.04*salary;
    }

    public double calculateGrossSalary() {
        return geteSalary() + petrol_allowance + food_allowance + other_allowance;
    }

    public double calculateNetSalary() {
        double pf;
        pf = 0.125 * geteSalary();
        return calculateGrossSalary() - pf;
    }

    public void display() {
        System.out.println("Manager Details:  Id:" + geteId() + " Name: " + geteName() + " Salary: " + geteSalary() + " Petrol Allowance: " 
            + petrol_allowance + " Food Allowance: " + food_allowance + " Other Allowance: " + other_allowance);
    }
}
