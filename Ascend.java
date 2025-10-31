// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {

		int range = Integer.parseInt(args[0]);
		int r1 = (int) (Math.random() * range);
		int r2 = (int) (Math.random() * range);
		int r3 = (int) (Math.random() * range);

		int a =  Math.min(r1,r2);
		int min = Math.min(r3, a);
		int c = Math.max(r1, r2);
		int max = Math.max(c, r3);
		int sum = r1 + r2 + r3 ;
		int mid = sum - (max+min);


		System.out.println(r1 + " " + r2 +" " + r3);
		System.out.println(min + " " + mid +" " + max);
		


	

		// Replace this comment with your code
	}
}
