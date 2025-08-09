package string;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abc  defg";
		
	//	System.out.println(checkLength(s));
		
		System.out.println(checkLength(s));

	}
	
	 public static int checkLength(String s) {
	        int count = 0;

	        try {
	            while (true) {
	                s.charAt(count);
	                count++;
	            }
	        } 
	        catch (Exception e) {
	        }

	        return count;
	    }
	
//	public static int checkLength(String s) {
//		
//		int cnt=0;
//		
//		for (int i = 0; i < s.length(); i++) {
//			
//			cnt++;
//		}
//		return cnt;
//	}

}
