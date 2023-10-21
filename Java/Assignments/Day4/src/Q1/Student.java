package Q1;

class Student extends Date{ 
    private int rollno;
    private String stud_name;
    private Date dob;
    private static int r =100;

    public Student() {
        r++;
        rollno=r;
        stud_name="not given";
        dob=new Date();
    }

    public Student(String stud_name, int day, int month, int year){
        r++;
        this.rollno = r;
        this.stud_name = stud_name;
        this.dob = new Date(day, month, year);
    }
 
    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", stud_name=" + stud_name + ", DOB: " + dob + "]";
    }

    public static void main(String[] args){
        Student s = new Student("Rohit", 20, 11, 2000);
        System.out.println(s);
    }

}
