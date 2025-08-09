package arrays;

import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]a= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		
		int [][]b= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		
		multiplication(a, b);

	}
	
	
	public static void multiplication(int [][]a, int[][]b) {
		
		int c[][]= new int[3][3];
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < b.length; j++) {
				
				for (int k = 0; k < c.length; k++) {
					
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		for (int i = 0; i < c.length; i++) {
			
			System.out.println(Arrays.toString(c[i]));
		}
	}

}
