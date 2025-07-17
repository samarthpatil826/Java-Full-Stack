package arrays;

import java.util.Arrays;

public class RetainRangeOfArray {
	
	public static int[] retainRange(int ar[], int start, int end) {
		
		int ans[]= new int[end-start];
		
		for (int i = 0, j=0; i < ar.length; i++) {
			
			if (i>=start && i<end) {
				
				ans[j]=ar[i];
				j++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {10,20,30,40,50,60,70};
		
		System.out.println(Arrays.toString(retainRange(ar, 4, 6)));

	}

}
