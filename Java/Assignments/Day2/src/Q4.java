public class Q4 {
    static int add(int... a){
        int sum=0;
        for(int val: a){
            sum += val;
        }
        return sum;
    }

    public static void main(String[] args){
        int ans = add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(ans);   
    }
}
