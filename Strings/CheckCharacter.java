package string;

public class CheckCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcdefgh";
		
		System.out.println(checkChar(s, 'z'));

	}
	
	public static int checkChar(String s, char ch) {
		
		int i;
		boolean check=false;
		for (i= 0; i < s.length(); i++) {
			
			if (ch==s.charAt(i)) {
				
				check=true;
				break;
			}
		}
		return check ? i :-1;
	}

}
