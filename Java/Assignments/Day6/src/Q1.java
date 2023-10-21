import java.util.Vector;
import java.util.Scanner;

class Employee {
    private int emp_id;
    private String emp_name;
    private double emp_salary;

    public Employee() {
        emp_id = 0;
        emp_name = "Not given";
        emp_salary = 0;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public double getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(double emp_salary) {
        this.emp_salary = emp_salary;
    }

    public Employee(int e_id, String e_name, double e_sal){
        this.emp_id = e_id;
        this.emp_name = e_name;
        this.emp_salary = e_sal;
    }

    @Override
    public String toString() {
        return "Employee Details ID: " + emp_id + " Name: " + emp_name + " Salary: " + emp_salary;
    }
}



public class Q1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Vector<Employee> v = new Vector<>();
        
        int choice = 0;
        while(choice != 5){
            System.out.println("Menu: \n" + 
                                "1. Insert Employee Record\n" + 
                                "2. Update employee information on the basis of Employee id\n" +
                                "3. Delete employee information on the basis of Employee id\n" + 
                                "4. Display all records\n" +
                                "5. Exit");

            int id;
            String name;
            double salary;
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter the employee id: ");
                    id = sc.nextInt();
                    System.out.println("Enter the Employee name: ");
                    name = sc.next();
                    System.out.println("Enter the salary: ");
                    salary = sc.nextDouble();
                    v.add(new Employee(id, name, salary));
                    System.out.println("New employee record added successfully...");
                    break;
                case 2:
                    System.out.println("Enter the employee id whose information you want to update: ");
                    id = sc.nextInt();

                    // Iterating vector of employee objects
                    for(Employee e: v){
                        if(e.getEmp_id() == id){
                            System.out.println("Enter the name: ");
                            name = sc.next();
                            System.out.println("Enter the salary");
                            salary = sc.nextDouble();
                            e.setEmp_name(name);
                            e.setEmp_salary(salary);
                        }
                        else
                            System.out.println("Id not found");
                    }

                    break;
                case 3:
                    System.out.println("Enter the employee id whose information you want to delete: ");
                    id = sc.nextInt();

                    int idx=Integer.MIN_VALUE;
                    for(int i=0; i<v.size(); i++){
                        Employee e = v.get(i);
                        if(e.getEmp_id() == id){
                            idx = i;
                        }
                    }
                    
                    if (idx != Integer.MIN_VALUE){
                        v.remove(idx);
                        System.out.println("Employee record deleted successfully");
                    }
                    else{
                        System.out.println("Id not found");
                    }
                    break;
                case 4:
                    System.out.println("All the records");
                    for(Employee e: v)
                        System.out.println(e);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Wrong choice... \nPlease Enter correct choice");
            }
        }

    }
}
