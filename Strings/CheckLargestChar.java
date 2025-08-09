package string;

public class CheckLargestChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="dgdfgfrfty";
		
		char max=Character.MIN_VALUE;
		
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i)> max) {
				
				max=s.charAt(i);
			}
		}
		System.out.println(max);
	}

}
