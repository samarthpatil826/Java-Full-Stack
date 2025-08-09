package string;

public class ExtractSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcdefghijk";
		
		System.out.println(extract(s, 2, 6));

	}
	
	public static String extract(String s, int strt, int end) {
		
		String ans="";
		
		for (int i = strt; i < end; i++) {
			
			char ch= s.charAt(i);
			ans+=ch;
		}
		return ans;
	}

}
