
public class CoinChanging {

	public static void main(String[] args) {
		
		int coins[] = new int[] {1,5,6,8};
		int total =11;
		
		// Dynamic Programming 
		
		int d[][]= new int[coins.length][total];
		for(int i=0; i<d.length; i++ ) {
			int backSteps =0;
			for(int j =0; j<d[i].length; j++) {
				// initialize for the first row 
				if(i==0) {
					int val = coins[i];
					int t = j+1;
					d[i][j] =t/val;
				}
				else{
					// get the value from the row above
					if(j+1<coins[i]) {
						d[i][j] = d[i-1][j];
					}
					else {
						// if value is equal than the result is always 1
						
						if(j+1== coins[i]) {
							d[i][j]=1;
							backSteps =j+1;
						}
						else {
							d[i][j]= Math.min(d[i-1][j],d[i][j-backSteps]+1);
						}
						
					}
				}
			}
		}
		
		
		System.out.println("The minmium number of coins needed to obtain the total of 11 is "+d[coins.length-1][total-1]);

	}

}
