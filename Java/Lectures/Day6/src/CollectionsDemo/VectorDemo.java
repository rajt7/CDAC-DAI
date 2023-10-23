package CollectionsDemo;
import java.util.*;

public class VectorDemo {
    public static void main(String[] args){
        Vector<Integer> v = new Vector<>();
        System.out.println(v.size() + " " + v.capacity());
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        System.out.println(v.size() + " " + v.capacity());
        v.add(60);
        System.out.println(v.size() + " " + v.capacity());

        System.out.println(v);                              // using toString method

        System.out.println("Using for each loop...");
        for(Integer val: v){                                // using for-each loop
            System.out.print(val + " ");
        }

        System.out.println("\nUsing iterator...");
        Iterator<Integer> itr = v.iterator();               // using iterator
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
    
}
