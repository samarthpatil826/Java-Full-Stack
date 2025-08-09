package string;

public class PasswordValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="S2113434@123";
		
		System.out.println(validate(s));

	}
	
	public static boolean validate(String s) {
		
		for (int i = 0; i < s.length(); i++) {
			
			if (s.length()>=8 && s.charAt(i)>'A' && s.charAt(i)<'z' ) {
				
				return true;
			}
		}
		return false;
	}

}
