package arrays;

import java.util.Scanner;

public class TwoDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] ar= new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Elements : ");
		
		for (int i = 0; i < ar.length; i++) {
			
			for (int j = 0; j < ar[i].length; j++) {
				
				ar[i][j]=sc.nextInt();
			}
		}
		
		for (int i = 0; i < ar.length; i++) {
			
			for (int j = 0; j < ar[i].length; j++) {
				
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}

	}

}
