import java.util.Scanner;

import com.cdac.pack1.Student;
import com.cdac.pack2.Batch;

public class Q4 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String stud_name;
        System.out.println("Enter Name of Student: ");
        stud_name = sc.next();
        Student s1 = new Student("Rohith");
        Student s2 = new Student("Raj");
        Student s3 = new Student(stud_name);
        Student s4 = new Student();

        Batch b1 = new Batch("DAI", 40);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(b1);

    }
    
}
