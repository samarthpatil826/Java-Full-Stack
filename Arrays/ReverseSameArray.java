package arrays;

import java.util.Arrays;

public class ReverseSameArray {
	
	public static int[] revArr(int ar[]) {
		int temp= ar.length-1;
		for (int i = 0; i < ar.length/2; i++, temp--) {
			
			ar[i]=ar[i]+ar[temp];
			ar[temp]= ar[i]-ar[temp];
			ar[i]=ar[i]-ar[temp];
			
		}
		return ar;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {1, 2, 3, 4, 5, 6};
		System.out.println(Arrays.toString(revArr(ar)));

	}

}
