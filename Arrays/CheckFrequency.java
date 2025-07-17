package arrays;

import java.util.Arrays;

public class CheckFrequency {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {10, -3, 6, 4, -3, 1, 4, 8, 6, 4, 6};
		
		System.out.println(Arrays.toString(frequency(ar)));
	}

}
