package Q2;

class Employee extends Date{
    private int eId;
    private String eName;
    private Date dob;
    
    public Employee() {
        eId = 0;
        eName = "not given";
        dob = new Date();
    }

    public Employee(int eId, String eName, int day, int month, int year){
        this.eId = eId;
        this.eName = eName;
        this.dob = new Date(day, month, year);
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void showDetails() {
        System.out.println("Employee Details:  Id:" + eId + " Name: " + eName + " DOB: " + dob);
    }
}

class WageEmployee extends Employee {
    private int hours;
    private double rate;

    public WageEmployee(){
        super();
        this.hours = 0;
        this.rate = 0;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public WageEmployee(int eId, String eName, int day, int month, int year, int hours, double rate){
        super(eId, eName, day, month, year);
        this.hours = hours;
        this.rate = rate;
    }

    public double calcSalary(){
        return rate * hours;
    }

    public void showDetails() {
        System.out.println("Employee Details:  Id:" + geteId() + " Name: " + geteName() + " DOB: " + getDob() + " Hours: " + hours + " Rate: " + rate);
    }
}

class SalesPerson extends WageEmployee{
    private int itemsSold;
    private double commission;

    public SalesPerson() {
        super();
        this.itemsSold = 0;
        this.commission = 0;
    }

    public SalesPerson(int eId, String eName, int day, int month, int year, int hours, double rate, int itemsSold, double commission){
        super(eId, eName, day, month, year, hours, rate);
        this.itemsSold = itemsSold;
        this.commission = commission;
    }

    public double calcSalary(){
        return getRate() * getHours() + itemsSold * commission;
    }

    public void showDetails() {
        System.out.println("Employee Details:  Id:" + geteId() + " Name: " + geteName() + " DOB: " + getDob() + " Hours: " + getHours() + " Rate: " + getRate() + 
                " Items Sold: " + itemsSold + " Commision: " + commission);
    }
}

public class Main{
    public static void main(String[] args){
        Employee e = new Employee(1, "Virat", 10, 10, 2020);
        e.showDetails();
        WageEmployee we = new WageEmployee(2, "Rohit", 4, 5, 2010, 20, 10);
        we.showDetails();
        System.out.println(we.calcSalary());
        SalesPerson sp = new SalesPerson(3, "Gill", 2, 3, 2001, 30, 20, 30, 5);
        sp.showDetails();
        System.out.println(sp.calcSalary());
    }
}
