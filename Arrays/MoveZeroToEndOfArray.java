/*Question Asked in Zoho Corporation

Given an array move all zeroes to end of array. 

Expected time complexity is O(n) and extra space is O(1).

Example:

Input :  arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 };
Output : arr[] = { 1, 2, 4, 3, 5, 0, 0, 0 };

Input : arr[]  = { 1, 2, 0, 0, 0, 3, 6 };
Output : arr[] = { 1, 2, 3, 6, 0, 0, 0 };
	
		int count = 0;

i ->  0   1   2   3   4   5   6   7   		
		---------------------------------
Input:	| 1 | 0 | 2 | 4 | 3 | 0 | 5 | 0 | 		
		---------------------------------		i = 0  count = 0 
		if(arr[i]!=0){
			arr[count++] = arr[i];
		}
		---------------------------------		
		| 1 | 0 | 2 | 4 | 3 | 0 | 5 | 0 |		
		---------------------------------

*/
public class MoveZeroToEndOfArray {

	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 };
		System.out.println("Input : { 1, 2, 0, 4, 3, 0, 5, 0 }");
		int count = 0;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] != 0)
				arr[count++] = arr[i];
		}
		
		while(count<arr.length){
			arr[count++] = 0;
		}
		System.out.print("Output : { ");
		
		String comma = ", ";
		for(int i=0; i<arr.length;i++) {
			if(i==arr.length-1) {
				comma = " }";
			}
			System.out.print(arr[i]+comma);
		}

	}

}
