/*
 * This class implements bubble sort with time complexity on O(n^2)
 */
public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = new int[] {5,1,4,2,8};
		for(int j =0; j<arr.length-1; j++) {
			for(int i =0; i<arr.length-j-1; i++) {
				if(arr[i]>arr[i+1]) {
					int a = arr[i];
					arr[i]=arr[i+1];
					arr[i+1] = a;
				}
			}
		}
	
	// Print the sorted array
	for(int i: arr) {
		System.out.println(i);
	}
	}

}
