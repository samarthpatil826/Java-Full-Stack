package string;

public class CommonSubsequenceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="FGFGERSCSDFCS";
		String s2="CFFREDFGERSCS";
		
		System.out.println(subSequence(s1, s2));

	}
	
	public static String subSequence(String s1, String s2) {
		
		String ans="";
		int max=0;
		
		for (int i = 0; i < s1.length(); i++) {
			
			int k=i;
			String temp="";
			
			for (int j=0; j < s2.length();j++) {
				
				if (k<s1.length() && s1.charAt(k)==s2.charAt(j)) {
					
					temp+=s1.charAt(k);
					k++;
					
				} else {
					
					if (temp.length()>0 && temp.length()>max) {
						
						max=temp.length();
						ans=temp;
						//temp="";
						j-=temp.length()-1;
					}
					k=i;
					temp="";
				}
			}
			if (temp.length()>max) {
				
				max=temp.length();
				ans=temp;
				//temp="";
			}
		}
		return ans;
	}

}
