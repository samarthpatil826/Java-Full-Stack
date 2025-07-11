package arrays;
import java.util.Arrays;

public class MakePositiveNegativeDifferent {
	
	public static int[] diff(int ar[]) {
		int mem=0;
		int ans[]= new int[ar.length];
		for (int i = 0, k=ar.length-1; i < ar.length; i++) {
			if(ar[i]>0) {
				ans[mem]=ar[i];
			    mem++;
			}
			else {
				ans[k]=ar[i] ;
				k--;
			}
			
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {4, 2, 7, -3, -8, 1, 5, 11};
		System.out.println(Arrays.toString(diff(ar)));

	}

}
