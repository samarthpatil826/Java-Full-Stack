package string;

public class FetchNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="1acd2bg5@l8";
		
		fetch(s);

	}
	
	public static void fetch(String s) {
		
		String num="";
		for (int i = 0; i < s.length(); i++) {
			
			char ch= s.charAt(i);
			if (ch>'0' && ch<'9') {
				
				num+=ch;
			}
		}
		int n=Integer.parseInt(num);
		System.out.println(n);
	}

}
