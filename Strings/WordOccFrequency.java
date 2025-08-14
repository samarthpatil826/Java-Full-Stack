package string;

public class WordOccFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="hiheyhelloheybyeheybyhey";
		
		String occ="hey";
		
		System.out.println(occ(s, occ));
	
	}
	
	public static int occ(String s, String occ) {
			
		int cnt=0;
		
		for (int i = 0, j=0; i < s.length();) {
			
			if (s.charAt(i)==occ.charAt(j)) {
				
				i++;
				j++;
				
				if (j==occ.length()) {
					cnt++;
					j=0;
				}
			} 
			
			else {
				i=i-j+1;
				j=0;
			}
		}
		return cnt;
	}
	
}
