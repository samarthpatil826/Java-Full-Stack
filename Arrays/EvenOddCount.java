package arrays;

public class EvenOddCount {
	
	public static int[] countEvenOdd(int arr[]) {
		
		int evencount=0;
		int oddcount=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]%2==0)
				evencount++;	
			 else 
				oddcount++;
		}
		int counts[]= {evencount, oddcount};
		return counts;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4, 3, 2, 6, 7, 11, 31, 24,27};
		int[] res= countEvenOdd(arr);
		
		System.out.println(res[0]);
		System.out.println(res[1]);

	}

}
