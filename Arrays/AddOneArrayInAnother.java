package arrays;

import java.util.Arrays;

public class AddOneArrayInAnother {
	
	public static int[] addArray(int ar1[], int ar2[]) {
		
		int index=3;
		int j=0;
		
		int ans[]= new int[ar1.length+ar2.length];
		
		for (int i = 0, mem=0; i < ans.length; i++) {
				if (i<index) {
					ans[i]=ar1[i];
					mem++;
				}
				else if (i>=index && j<ar2.length) {
					ans[i]=ar2[j];
					j++;
				}
				else if (mem<ar1.length ) {
					ans[i]=ar1[mem];
					mem++;
				}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar1[]= {10, 20, 30, 40, 50};
		int ar2[]= {100, 200, 300, 400};
		
		System.out.println(Arrays.toString(addArray(ar1, ar2)));

	}

}
