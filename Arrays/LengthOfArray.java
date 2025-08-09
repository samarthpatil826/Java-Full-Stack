package arrays;

public class LengthOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] ar= {1,2,3,4,5,6};
		
		System.out.println(checkLength(ar));

	}
	
	public static int checkLength(int ar[]) {
		
		int count=0;
		try {
			
			while (true) {
				int temp=ar[count];
				count++;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return count;
	}

}
