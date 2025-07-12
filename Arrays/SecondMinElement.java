package arrays;

public class SecondMinElement {
	
	public static void minEle(int ar[]) {
		
		int min=Integer.MAX_VALUE;
		int secMin=Integer.MAX_VALUE;
		
		for (int i = 0; i < ar.length; i++) {
			
			if (ar[i]< min) {
				
				secMin=min;
				min=ar[i];
			}
			else if (ar[i]< secMin) {
				secMin=ar[i];
			}
		}
		System.out.println(min);
		System.out.println(secMin);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {5, 3, -8, 7, 11, 9, 2};
		minEle(ar);

	}

}
