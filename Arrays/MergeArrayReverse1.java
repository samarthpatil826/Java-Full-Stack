package arrays;
import java.util.Arrays;


public class MergeArrayReverse1 {
	
	public static int[] mergeRev(int ar1[], int ar2[]) {
	
		int ans[]= new int[ar1.length + ar2.length];
		
		int  mem= 0;
		
		for (int i = 0; i < ar1.length; i++, mem++) {
			
			ans[mem]=ar1[i];
		}
		
		for (int i = 0; i < ar2.length; i++, mem++) {
			
			ans[mem]= ar2[ar2.length-1-i];
			
		}
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar1[]= {10, 20, 30, 40};
		int ar2[]= {50, 60 ,70, 80, 90};
		
		System.out.println(Arrays.toString(mergeRev(ar1, ar2)));

	}

}

