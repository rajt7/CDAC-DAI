package Q3;

public class Tester {
    public static void main(String[] args){
        Employee e = new Employee(1, "Gill", 30000);
        e.display();

        Manager m = new Manager(7, "Dhoni", 50000);
        m.display();
        System.out.println("Manager Gross Salary: " + m.calculateGrossSalary());
        System.out.println("Manager Net Salary: " + m.calculateNetSalary());

        MarketingExecutive me = new MarketingExecutive(3, "Virat", 40000, 10);
        me.display();
        System.out.println("Marketing Executive Gross Salary: " + me.calculateGrossSalary());
        System.out.println("Marketing Executive Net Salary: " + me.calculateNetSalary());
    }
}
