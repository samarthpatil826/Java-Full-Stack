package string;

public class CheckStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abccba";
		
		int i;
		for (i = 0; i <= s.length()/2; i++) {
			
			if (s.charAt(i) != s.charAt(s.length()-1-i)) {
				
				break;
			}
		}
		if (i>s.length()/2) {
			
			System.out.println("It is palindrome");
			}
		else {
			System.out.println("Not a palindrome");
		}

	}

}
