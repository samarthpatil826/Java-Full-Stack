package arrays;

import java.util.Arrays;

public class RotateElements {
	
	public static void rotateLeft(int ar[], int times) {
		
		for (int i = 0; i < times; i++) {
			
			int temp=ar[0];
			
			for (int j = 1; j < ar.length; j++) {
				ar[j-1]=ar[j];
			}
			ar[ar.length-1]=temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {10, 20, 30, 40, 50};
		
		rotateLeft(ar, 3);
		System.out.println(Arrays.toString(ar));

	}

}
