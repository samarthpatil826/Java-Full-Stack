package arrays;
import java.util.Arrays;

public class ReverseZigzagArray {
	
	public static int[] revArray(int ar1[], int ar2[]) {
		
		int n1=0, n2=0;
		int ans[]= new int[ar1.length+ ar2.length];
		
		for (int i = 0; i < ans.length; i++) {
			
			if (i%2==0 && n1<ar1.length) {
				ans[i]= ar1[ar1.length-1-n1];
				n1++;
				
			} 
			else {
				ans[i]=ar2[ar2.length-1-n2];
				n2++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[]= {10, 20, 30, 40};
		int ar2[]= {50, 60, 70, 80};
		System.out.println(Arrays.toString(revArray(ar1, ar2)));

	}

}
