package string;

public class Replace1stOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="absdsklmst";
		
		System.out.println(occurance(s, 's', 'z'));

	}
	
	public static String occurance(String s, char occ, char rep)
	{
		String ans="";
		boolean replace=true;
		for (int i = 0; i < s.length(); i++) {
			
			if (replace && s.charAt(i)==occ) {
				
				ans+=rep;
				replace=false;
			}
			else {
				ans+=s.charAt(i);
			}
		}
		return ans;
	}
	

}
