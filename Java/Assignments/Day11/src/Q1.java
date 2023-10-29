import java.io.*;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        File file1 = new File("src.txt");
        File file2 = new File("dest.txt");
        
        Scanner sc = new Scanner(file1);

        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("File dest.txt created...");

        // try {
        //     char [] s = new char[100];
        //     FileReader fr1 = new FileReader(file1);
        //     fr1.read(s);
        //     System.out.println(s);
        //     try {
        //         FileWriter fw2 = new FileWriter(file2);
        //         String lines = String.valueOf(s);
        //         fw2.write(lines);
        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     }
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        while(sc.hasNextLine()){
            
        }
        
    }
    
}
