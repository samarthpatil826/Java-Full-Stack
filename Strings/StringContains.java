package string;

public class StringContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "plplplaplplane";
		
		String t= "plat";
		
		System.out.println(contains(s, t));
		

	}
	
	public static boolean contains(String s, String t) {
		
		int check=0;
		int i=0;
		
		while (i<s.length()) {
			
			if (check<t.length() && s.charAt(i)== t.charAt(check)) {
				
//				System.out.println("check "+check);
//				System.out.println("i "+i);
				
				check++;
				i++;
				
			}
			else {
				if (check==t.length()) {
					
					//System.out.println(check);
					return true;					
				} 
				else if (check>0) {
					
					i--;
					check=0;
					
				}
				else {
					i++;
				}
			}
		}
		return false;
	}

}
