package arrays;
import java.util. Scanner;

public class FindElement {
	
	public static boolean isFound(int arr[], int ele) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==ele)
				return true;
		}
		 return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2, 5, 6, 4, 9, 8};
		
		System.out.println("Enter the element to find : ");
		int ele= new Scanner(System.in).nextInt();
		System.out.println(isFound(arr, ele));

	}

}
