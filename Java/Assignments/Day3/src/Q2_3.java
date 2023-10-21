public class Q2_3 {
    public static void main(String[] args){
        Student s = new Student("Iron Man", 78.42);
        System.out.println(s);
    }
}

class Student{
    private int rollno;
    private String stud_name;
    private double percentage;
    private static int r =101;

    public Student(String stud_name,double percentage){
        r++;
        this.rollno = r;
        this.stud_name = stud_name;
        this.percentage = percentage;
    }
    public void setStud_name(String stud_name) {
        this.stud_name = stud_name;
    }
    public void setPercentage(double percentage){
        this.percentage = percentage;
    }
    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", stud_name=" + stud_name + ", percentage=" + percentage + "]";
    }
    public int getRollno(){
        return rollno;
    }
    public String getStud_name(){
        return stud_name;
    }

    public double getPercentage(){
        return percentage;
    }

}

