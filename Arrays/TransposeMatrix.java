package arrays;

import java.util.Arrays;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]ar= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		
		for (int i = 0; i < ar.length; i++) {
			
			int temp=0;
			for (int j = i; j < ar[i].length; j++) {
				
				if (j>i) {
					temp=ar[i][j];
					ar[i][j]=ar[j][i];
					ar[j][i]=temp;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(Arrays.toString(ar[i]));
		}

	}

}
