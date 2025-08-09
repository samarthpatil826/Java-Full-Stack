package string;

import java.util.Arrays;

public class ConvertStringToByteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="India is my country";
		
		System.out.println(Arrays.toString(byteArray(s)));

	}
	
	public static byte[] byteArray(String s) {
		
		byte[] ar= new byte[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			
			ar[i]=(byte)s.charAt(i);
		}
		return ar;
	}

}
