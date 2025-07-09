package arrays;
import java.util.Scanner;

public class CountOfRepeatedElements {
	
	public static int count(int arr[], int ele) {
		int count=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]==ele) 
				
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		
		int arr[]= {2, 4, 3, 2, 1, 3, 2, 9, 8, 2};
		
		System.out.println("Enter the element to find : ");
		int ele= new Scanner(System.in).nextInt();
		
		System.out.println(count(arr, ele));
		
	}

}
