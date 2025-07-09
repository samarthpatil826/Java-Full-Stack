package arrays;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		
		int arr[]= {4, 7, 6, 11, 15, 21, 24};
		
		System.out.println("Even Sum "+evenSum(arr));
		System.out.println("Odd Sum "+oddSum(arr));
		
	}
	
	public static int evenSum(int arr[]) 
	{
		
		int even=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]%2==0) {
				even+=arr[i];
			}
		}
		return even;
		
	}
	
	public static int oddSum(int arr[])
	{
		int odd=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 !=0)
				odd+=arr[i];
			
		}
		return odd;
	}

}
