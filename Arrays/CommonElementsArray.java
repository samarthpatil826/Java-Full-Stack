package arrays;

import java.util.Arrays;

public class CommonElementsArray {
	
	public static int[] frequency(int ar[]) {
		
		int count[]=new int[ar.length];
		
		for (int i = 0; i < ar.length; i++) {
			
			int ct=0;
			
			if (count[i] != -1) {
				
				for (int j = i+1; j < count.length; j++) {
					if (ar[i]==ar[j]) {
						ct++;
						count[j]=-1;
					}
				}
				count[i]=ct;
			}
		}
		return count;
	}
	
	public static void commonEle(int ar[]) {
		
		int ct=0;
		int freq[]=frequency(ar);
		
		for (int i = 0; i < ar.length; i++) {
			if (freq[i]>0) {
				ct++;
			}
		}
		int ans[]=new int[ct];
		
		for (int i = 0, j=0; i < ans.length; i++) {
			if (freq[i]>0) {
				ans[j]=ar[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(ans));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {1,2,3,2,1,5,6,3};
		
		commonEle(ar);
		
	}

}
