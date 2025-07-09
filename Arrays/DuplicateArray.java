package arrays;
import java.util.Arrays;

public class DuplicateArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10, 20, 80, 30, 60};
		
		int[] dup= new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			
			dup[i]=arr[i];
		}
		System.out.println(Arrays.toString(dup));

	}

}
