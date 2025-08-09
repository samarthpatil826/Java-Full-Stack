package string;

public class PhoneValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num="5307780296";
		
		System.out.println(validate(num)?"Valid number":"Invalid number");

	}

	public static boolean validate(String s) {
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch=s.charAt(i);
			
			if (s.length()<=10 && s.charAt(0)=='9' || s.charAt(0)=='8' || s.charAt(0)=='7' ) {
				return true;
			}
		}
		return false;
	}

}
