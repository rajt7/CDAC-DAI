import java.util.*;

class Student implements Comparable<Student> {
    private int rollno;
    private String name;
    private double percentage;
    private Set<String> skillset = new TreeSet<>();

    public Student(int rollno, String name, double percentage, Set<String> skills){
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
        this.skillset = skills;
    }

    public double getPercentage() {
        return percentage;
    }

    public void display() {
        System.out.println("Roll No: " + rollno + " ,Name: " + name + " ,Percentage: " + percentage + " ,Skills: " + skillset);
    }

    @Override
    public int compareTo(Student s1){
        if(this.rollno > s1.rollno)
            return 1;
        else if(this.rollno < s1.rollno)
            return -1;
        else
            return 0;
    }
}

class CompareStudentPercentage implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        if(s1.getPercentage() < s2.getPercentage())
            return 1;
        else if(s1.getPercentage() > s2.getPercentage())
            return -1;
        else
            return 0;
    }
}

class UtilityList{
    private List<Student> list;

    public UtilityList(){
        list = new ArrayList<>();
    }

    public UtilityList(List<Student> list){
        this.list = new ArrayList<>();
    }

    public void createList() {
        int rollno, n;
        String name;
        double percentage;
        Set<String> skills = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");
        System.out.println("Enter student rollno:");
        rollno = sc.nextInt();
        System.out.println("Enter student name:");
        name = sc.next();
        System.out.println("Enter student percentage:");
        percentage = sc.nextDouble();
        System.out.println("How many skills do you have?");
        n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Enter the " + i + " skill: ");
            skills.add(sc.next());
        }
        System.out.println(skills);
        list.add(new Student(rollno, name, percentage, skills));
    }

    public void printList() {
        for(Student s: list){
            s.display();
        }
    }

    public void sortByRollNo() {
        Collections.sort(list);
         for(Student s: list)
            s.display();
    }

    public void sortByPercentage() {
        Collections.sort(list, new CompareStudentPercentage());
        for(Student s: list)
            s.display();
    }

}

public class Q1{
    public static void main(String[] args){
        UtilityList u1 = new UtilityList(null);
        int total_students = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many students information you want to enter? ");
        total_students = sc.nextInt();

        // Entering the student details
        for(int i=0; i<total_students; i++)
            u1.createList();

        // Displaying the student details
        u1.printList();

        System.out.println("Sort by Roll Number");
        u1.sortByRollNo();

        System.out.println("Sort by Percentage");
        u1.sortByPercentage();
    }
}
