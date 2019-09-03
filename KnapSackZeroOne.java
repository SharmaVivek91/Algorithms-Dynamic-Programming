
public class KnapSackZeroOne {

	public static void main(String[] args) {
		
		int weight[] = new int[] {1,3,4,5};
        int value[] = new int[] {1,4,5,7};
        int knapsackWeight =7;
        // using dynamic programming
        int a[][] = new int[weight.length][knapsackWeight];
        for(int i=0; i<a.length; i++) {
        	int remaining = 0;
        	for(int j =0; j<a[i].length; j++){
        		// values for first row is the only weight that we can use to fill knapsack
        		if(i==0) {
        			a[i][j]= value[i];
        		}
        		else {
        			//here j+1 represents the available weight of knapsack in matrix
        			if(weight[i]>(j+1)) {
        				a[i][j]=a[i-1][j];
        			}
        			else {
        				int add =0;
        				if(remaining ==0) add=0;
        				else
        				add = a[i-1][remaining-1];
        				a[i][j]=Math.max(value[i]+add,a[i-1][j]);
        				remaining++;
        			}
        		}
        		
        	}
        }
        
      System.out.println("The maximum value in the knapsack of weight 7 is:"+a[weight.length-1][knapsackWeight-1]);
        
	}

}
