package arrays;
import java.util.Arrays;

public class NegativeEleToPositiveArray {
	
	public static int[] makePositive(int ar[]) {
		
		for (int i = 0; i < ar.length; i++) {
			
			if (ar[i]<0)
				ar[i]= -ar[i];
			
			else 
				ar[i]= ar[i];
		}
		return ar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {2, -4, 6, -8, 9};
		System.out.println(Arrays.toString(makePositive(ar)));

	}

}
