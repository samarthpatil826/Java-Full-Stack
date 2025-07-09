package arrays;
import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10, 20, 30, 40, 50};
		System.out.println(Arrays.toString(revArray(arr)));

	}
	
	public static int[] revArray(int arr[]) {
		int dup[]= new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			dup[i]=arr[arr.length-1-i];
		}
		return dup;
	}

}
