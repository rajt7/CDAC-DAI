package Q2;
public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        day=01;
        month=01;
        year=2001;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void show(){
        System.out.println(day + "/" + month + "/" + year);
    }

    @Override
    public String toString(){
        return "Date: " + day + "/" + month + "/" + year;
    }
    
}
