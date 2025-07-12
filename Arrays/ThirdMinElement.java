package arrays;

public class ThirdMinElement {
	
	public static void minEle(int ar[]) {
		
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		int min3=Integer.MAX_VALUE;
		
		for (int i = 0; i < ar.length; i++) {
			
			if (ar[i]< min1) {
				
				min3=min2;
				min2=min1;
				min1=ar[i];
			}
//			else if (ar[i]<min2) {
//				
//				min3=min2;
//				min2=ar[i];
//				System.out.println("hi");
//			}
//			else if (ar[i]< min3) {
//				min3=ar[i];
//				System.out.println("hiiiii");
//			}
		}
		System.out.println("Min 1 "+min1);
		System.out.println("Min 2 "+min2);
		System.out.println("Min 3 "+min3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {5, 3, -8, 7, 11, 9, 2};
		minEle(ar);

	}

}
