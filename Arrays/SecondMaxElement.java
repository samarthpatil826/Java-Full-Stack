package arrays;

public class SecondMaxElement {
	
	public static void maxEle(int ar[]) {
		
		int max= Integer.MIN_VALUE;
		int secMax= Integer.MIN_VALUE;
		
		for (int i = 0; i < ar.length; i++) {
			
			if (ar[i]>max) {
				secMax= max;
				max=ar[i];
			}
			else if (ar[i]> secMax && ar[i] != max) {
				secMax=ar[i];
			}
		}
		System.out.println(max);
		System.out.println(secMax);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {5, 3, -8, 7, 11, 9, 2};
		maxEle(ar);

	}

}
