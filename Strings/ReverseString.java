package string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="hello world";
		
		String rev="";
		
		for (int i = s.length()-1; i >=0; i--) {
			
			rev+=s.charAt(i);
		}
		
		System.out.println(rev);

	}

}
