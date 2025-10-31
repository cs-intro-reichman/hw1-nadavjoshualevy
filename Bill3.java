/// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		
	    String name1 = args[0];//input 1
		String name2 = args[1];//input 2
		String name3 = args[2];//input 3
	
	    double bill = Double.parseDouble(args[3]);//input 4
		double share = bill / 3;
        double roudedShare = Math.ceil(share);
	    System.out.println("Dear " + name3 + ", " + name2 + " "  + name1 + ": pay " + roudedShare + " Shekels each."); 
	}
}
