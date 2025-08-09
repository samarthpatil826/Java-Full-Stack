package string;

public class ConvertUpperLowerToggleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abCsDfgH";
		
		System.out.println(toUpper(s));
		
		System.out.println(toLower(s));
		
		System.out.println(toggleCase(s));

	}
	
	public static String toUpper(String s) {
		
		String ans="";
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch=s.charAt(i);
			
			if (ch>='a' && ch<='z') {
				
				ans+=(char)(ch-32);
				
			} else {
				
				ans+=ch;
			}
		}
		return ans;
	}
	
	public static String toLower(String s) {
		
		String ans="";
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch=s.charAt(i);
			
			if (ch>='A' && ch<='Z') {
				
				ans+=(char)(ch+32);
				
			} else {
				
				ans+=ch;
			}
		}
		return ans;
	}
	
	public static String toggleCase(String s) {
		
		String ans="";
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch=s.charAt(i);
			
			if (ch>='a' && ch<='z') {
				
				ans+=(char)(ch-32);
				
			} else if (ch>='A' && ch<='Z') {
				
				ans+=(char)(ch+32);
			}
		}
		return ans;
	}

}
