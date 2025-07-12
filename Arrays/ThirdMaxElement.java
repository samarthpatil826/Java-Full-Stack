package arrays;

public class ThirdMaxElement {
	
	public static void maxEle(int ar[]) {
		
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int max3=Integer.MIN_VALUE;
		
		for (int i = 0; i < ar.length; i++) {
			
			if (ar[i]> max1) {
				
				max3= max2;
				max2=max1;
				max1=ar[i];
			}
			else if (ar[i]> max2) {
				max3= max2;
				max2=ar[i];
			}
			else if(ar[i]> max3) {
				max3=ar[i];
			}
		}
		System.out.println("First max "+ max1);
		System.out.println("Second max "+ max2);
		System.out.println("Third max "+ max3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {5, 3, -8, 7, 11, 9, 2};
		maxEle(ar);

	}

}
