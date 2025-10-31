// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
	
		 double currentValue = Double.parseDouble(args[0]);
		 double rate = Double.parseDouble(args[1]);
		 double correctrate = rate/100;
		int n = Integer.parseInt(args[2]);

		double futurevalue = currentValue * Math.pow(1+ correctrate, n);

		System.out.println("After " + n + " years, $" + (int)currentValue + " saved at " + rate + "% will yield $" + (int)futurevalue);

	}
}