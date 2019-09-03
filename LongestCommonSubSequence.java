
public class LongestCommonSubSequence {

	public static void main(String[] args) {
		// The longest common subsequence between them is abcf
		String a ="abcdaf";
		String b = "acbcf";
		
		//Dynamic Programming
		String larger = (a.length()>b.length())? a:b;
		String smaller = (a.length()<b.length())? a:b;
		
		int rows = smaller.length();
		int cols = larger.length();

		int d[][] = new int[rows][cols];
		for(int i=0; i<rows; i++) {
		    boolean check =false;
		    int val =0;
			for(int j =0; j<cols; j++) {
				//for the first row we have string of length only one
				if(i==0) {
					if(smaller.charAt(0)==larger.charAt(0))
					d[i][j]=1;
					else d[i][j]=0;
				}
				
				else {
					    
						//check if the character at i in smaller string is equal to 
						//char at j in larger	
						if(smaller.charAt(i)==larger.charAt(j)){
							check =true;
							val = d[i-1][j-1]+1;
						}
						
						if(check ==false) {
							d[i][j] =d[i-1][j];
						}
						else {
							d[i][j]=val;
						}
				}
			}
		}
		
		System.out.println("The longest common sub sequence is of length:"+d[rows-1][cols-1]);
	}

}
