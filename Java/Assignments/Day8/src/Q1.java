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

    public String getName() {
        return name;
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

    public void createList(int rollno, String name, double percentage, Set<String> skills) {
        list.add(new Student(rollno, name, percentage, skills));
    }

    public void printList() {
        for(Student s: list){
            s.display();
        }
    }

    public List<Student> getList() {
        return list;
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

class UtilityReport {
    private Map<String, Double> m;

    public UtilityReport(){
        m = new HashMap<>();
    }

    public void showReport(List<Student> students){
        if(students.isEmpty())
            System.out.println("There are no student details available...");
        else{
            for(Student s: students){
                m.put(s.getName(), s.getPercentage());
            }

            Set<String> studNames = m.keySet();
            for(String name: studNames)
                System.out.println("Name: " + name + ", Percentage: " + m.get(name));
        }
    }
}

public class Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        int total_students;
        System.out.println("How many students information you want to enter? ");
        total_students = sc.nextInt();

        int rollno, n;
        String name;
        double percentage;
        Set<String> skills = new TreeSet<>();

        UtilityList u1 = new UtilityList(null);

        // Entering the student details
        for(int i=1; i<=total_students; i++){
            System.out.println("Enter student rollno:");
            rollno = sc.nextInt();
            System.out.println("Enter student name:");
            name = sc.next();
            System.out.println("Enter student percentage:");
            percentage = sc.nextDouble();
            System.out.println("How many skills do you have?");
            n = sc.nextInt();

            for(int j=1; j<=n; j++){
                System.out.println("Enter the " + j + " skill: ");
                skills.add(sc.next());
            }

            u1.createList(rollno, name, percentage, skills);
        }

        // Displaying the student details
        u1.printList();
        List<Student> studentsList;
        studentsList = u1.getList();

        UtilityReport ur = new UtilityReport();
        ur.showReport(studentsList);
    }
}
