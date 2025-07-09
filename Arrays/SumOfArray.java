package arrays;

public class SumOfArray {

	public static void main(String[] args) {
		
		int []arr= {10, 30, 40, 05, 20};
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
