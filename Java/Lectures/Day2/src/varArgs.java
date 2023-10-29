public class varArgs {
    /*  General Method
	public static int add(int a, int b, int c, int d, int e) {
		return a+b+c+d+e;
	}
	*/
	
	// Method to have variable number of args
	public static int add(int ...a) {
		int sum=0;
		for(int val: a)
			sum += val;
		return sum;
	}

    public static void main(String[] args) {
		// Method add
		System.out.println(add(1, 2, 3, 4));
	}

}
