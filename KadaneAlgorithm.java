/*
 * This class is used to find the largest sum of the contiguous sub array
 */
public class KadaneAlgorithm {

	public static void main(String[] args) {
    int ar[] = new int[] {-2,-3,4,-1,-2,1,5,-3};
		
		int maxSum =Integer.MIN_VALUE;
		int curSum =0;
		
		for(int i=0; i<ar.length; i++) {
		      curSum +=ar[i];
		      if(curSum<0) {
		    	  curSum =0;
		      }
		      if(curSum>maxSum) {
		    	  maxSum = curSum;
		      }
		}
		System.out.println(maxSum);

	}

}
