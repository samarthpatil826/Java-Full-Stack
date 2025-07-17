package arrays;

import java.util.Arrays;

public class RetainOccurance {
	
	public static int[] retainOcc(int ar[], int ele) {
		
		int cnt=0;
		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]==ele)
				cnt++;
		}
		int ans[]= new int[cnt];
		
		for (int i = 0, j=0; i < ar.length; i++) {
			if (ar[i]==ele) {
				ans[j]=ar[i];
				j++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {10, 20, 30, 20, 50, 10, 40, 20};
		
		System.out.println(Arrays.toString(retainOcc(ar, 20)));

	}

}
