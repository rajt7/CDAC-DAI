
public class ArrayCopy {

	public static void main(String[] args) {
		int [] a = {4, 5, 3, 4, 6};
		int [] b = new int[3];
		
		// System.arraycopy(sourceArr, sourcepos, destArr, destPos, len)
		System.arraycopy(a, 2, b, 1, 2);
		
		for(int val: b)
			System.out.print(val + " ");
	}
}
