package string;

public class FetchNumberAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="1acd2bg5@l8";
		
		fetchAndSum(s);
	}
	
	public static void fetchAndSum(String s) {
		
		int num=0;
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch=s.charAt(i);
			if (ch>='0' && ch<='9') {
				
				num+=ch-48;
			}
		}
		System.out.println(num);
	}

}
