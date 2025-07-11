package arrays;

import java.util.Arrays;

public class EvenArray {
	
	public static int[] even(int ar[]) {
		
		for (int i = 0; i < ar.length; i++) {
			
			if (ar[i]%2 !=0) {
				
				ar[i]=++ar[i];
			} 
			else {
				ar[i]= ar[i];

			}
		}
		return ar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {2, 4, 3, 5, 8, 7, 9};
		System.out.println(Arrays.toString(even(ar)));
	}

}
