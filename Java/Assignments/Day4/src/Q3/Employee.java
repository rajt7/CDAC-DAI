package Q3;

class Employee {
    private int eId;
    private String eName;
    private double eSalary;
    
    public Employee() {
        eId = 0;
        eName = "not given";
        eSalary = 0;
    }

    public Employee(int eId, String eName, double eSalary){
        this.eId = eId;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public double geteSalary() {
        return eSalary;
    }

    public void seteSalary(double eSalary) {
        this.eSalary = eSalary;
    }

    public void display() {
        System.out.println("Employee Details:  Id:" + eId + " Name: " + eName + " Salary: " + eSalary);
    }
}
