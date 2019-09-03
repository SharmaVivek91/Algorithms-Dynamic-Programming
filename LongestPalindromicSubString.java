
public class LongestPalindromicSubString {

	public static void main(String[] args) {
		String st = "abaabc";  //The longest palindromic substring in it is baab
		
		// Using dynamic programming to solve in O(n^2) time complexity
		// can be solved in linear complexity using Manachers Algorithm
		
		boolean d[][] = new boolean[st.length()][st.length()];
		
		int max =0;
		int start =0; int end =0;
		
		
		// add values diagonally 
		for(int i =0; i<st.length(); i++) {
			int k =i;
			for(int j =0; j<st.length(); j++) {
				
				
				// if k gretaer than st length break
				if(k>=st.length()) break;
				
				// all the diagonal elements are palindrome of length 1 e.g. (0,0)(1,1) and so on
				if(i==0){
					d[j][k] =true;
				}
				// fill the first diagonal after the main diagonal before predicitng
				else if(i==1){
					if(st.charAt(k)==st.charAt(j)) {
						d[j][k]=true;
					}
					else {
						d[j][k] =false;
					}
				}
				// Use DP to predict check characters and values at i+1 and j-1
				else {
					if(st.charAt(k)==st.charAt(j) && d[j+1][k-1]==true) {
						d[j][k]=true;
					}
					else {
						d[j][k]=false;
					}
				}
				
				// find the length
				if(d[j][k]==true) {
					int rlength = (k-j)+1;
					if(rlength>=max) {
						max = rlength;
						start = j;
						end = k;
					}
				}
				k++;
				
			}
		}
		
		if(start==end) {
			System.out.println("The longest palindromic substring is "+st.charAt(end));
		}
		else if(end==st.length()-1) {
			System.out.println("The longest palindromic substring is "+st.substring(start));
		}
		else {
			System.out.println("The longest palindromic substring is "+st.substring(start, end+1));
		}
		
		

	}

}
