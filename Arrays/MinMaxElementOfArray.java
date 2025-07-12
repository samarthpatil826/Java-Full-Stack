package arrays;

public class MinMaxElementOfArray {
	
	public static void maxEle(int ar[]) {
		
		int max= Integer.MIN_VALUE;
		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]>max) {
				max= ar[i];
			}
		}
		System.out.println(max);
	}
	
	public static void minEle(int[] ar) {
		
		int min= Integer.MAX_VALUE;
		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]< min) {
				min=ar[i];
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {4, 6, 8, -3, -28, 22, 2};
		maxEle(ar);
		minEle(ar);

	}

}
