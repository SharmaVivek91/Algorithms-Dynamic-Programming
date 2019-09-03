
public class MaximumSumSubsequentNonAdjacentArray {

	public static void main(String[] args) {
		int arr[] = new int[] {4,1,1,4,2,1};
		
		//Dynamic programming for positive array
		
		//The variable inclusive will have the sum including the variable
		int inclusive =arr[0];
		// Exclusive will contain the sum excluding the variable
		int exclusive =0;
		
		for(int i=1;i<arr.length; i++){
			int pastInclusive = inclusive;
			inclusive = Math.max(pastInclusive,exclusive+arr[i]);
			exclusive = pastInclusive;
		}
		
		// The max of inclusive or exclusive will be the answer
		
		
		System.out.println("The maximum sum of the subsequent non adjacent array is:"+Math.max(inclusive, exclusive));

	}

}
