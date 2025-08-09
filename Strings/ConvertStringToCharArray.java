package string;

import java.util.Arrays;

public class ConvertStringToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="India is my country";
		
		System.out.println(Arrays.toString(convertChar(s)));
	}
	
	public static char[] convertChar(String s) {
		
		char[] ch= new char[s.length()];
		
		for (int i = 0; i < ch.length; i++) {
			
			ch[i]=(char)s.charAt(i);
		}
		return ch;
	}

}
