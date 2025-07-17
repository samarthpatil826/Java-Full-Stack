package arrays;

public class BinarySearch {
	
	public static void binarySearch(int ar[], int search) {
		
		int start=0, end=ar.length-1, mid=start+end/2;
		
		while (start<=end) {
			
			if (ar[mid]==search) {
				// System.out.println("element found "+mid+" index");
				 break;
			}
			else if (search> ar[mid]) {
				start=mid+1;
			}
			else if (search< ar[mid]) {
				end=mid-1;
			}
			mid=(start+end)/2;
		}
		System.out.println(ar[mid]==search?"element found at "+mid+" index":"element not found");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {5,15,33,48,70,81,96,100,101,102,103,104,105,106,107,108,109, 200, 205, 240, 270, 300, 414, 505};
		binarySearch(ar, 115);
		

	}

}
