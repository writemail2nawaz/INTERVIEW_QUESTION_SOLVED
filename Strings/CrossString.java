/*
Problem : Given a string of odd length convert it into cross character or cross string 
			(i.e Diagonal from left-right and from right-left)

			Example: Input : LOVE2CODE
					 Output: L                E
					 		   O            D  
					 		     V       O     
					 		       E   C 
					 		         2 
					 		       E   C
					 		     V       O
					 		   O            D  
					 		 L                E

			Example: Input : INDIA 
					 size = 5-1 = 4
					 Output:       
					  			J --->    0   1   2   3   4  

					  					---------------------
							i = 0  -->	| I |   |   |   | A |
										---------------------
							i = 1  -->	|   | N |   | I |   |
										---------------------
							i = 2  -->	|   |   | D |   |   |
										---------------------
							i = 3  -->	|   | N |   | I |   |
										---------------------
							i = 4  -->	| I |   |   |   | A |
										---------------------
*/

import java.util.Scanner;

public class CrossString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		
		String str = sc.next();
		
		int size = str.length(); 
		System.out.println("Output : ");
		
		if(size%2==0) {
			System.out.println("Entered string is of even length");
			return;
		}
		
		
		
		int k=size;
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size;j++) {
				if(i==j) {
					System.out.print(str.charAt(i)+" ");
						if(i==size/2) {
							--k;
						}
				}else if(i+j==size-1) {
					System.out.print(str.charAt(--k)+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
