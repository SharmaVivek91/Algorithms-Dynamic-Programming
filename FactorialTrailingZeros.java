
public class FactorialTrailingZeros {
	
	public static void main(String[] args) {
		int n =75;
		long res =0;
		// count the multiples of 5, 25, 125... and so on in the factorial
		for(int i=5; i<=n; i = i*5) {
			res +=n/i;
		}
		
	    System.out.println("The number of zeros trailing in the factorial of 75 is: "+res);

	}

}
