package Q3;

public class MarketingExecutive extends Employee{
    private int kms;
    private double tour_allowance;
    private static int telephone_allowance=2000;

    public MarketingExecutive(int id, String name, double salary, int kms) {
        super(id, name, salary);
        this.kms = kms;
        this.tour_allowance = 5*kms;
    }

    public double calculateGrossSalary() {
        return geteSalary() + tour_allowance;
    }

    public double calculateNetSalary() {
        double pf;
        pf = 0.125 * geteSalary();
        return calculateGrossSalary() - pf;
    }

    public void display() {
        System.out.println("Marketing Executive Details:  Id:" + geteId() + " Name: " + geteName() + " Salary: " + geteSalary() + " Kms: " + kms + 
            " Tour Allowance: " + tour_allowance + " Telephone Allowance: " + telephone_allowance);
    }
    
}
