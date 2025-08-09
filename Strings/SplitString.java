package string;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="HI_HELLO_HEY";
		char from='_';
		
		System.out.println(Arrays.toString(split(s, from)));

	}
	
	public static String[] split(String s, char from) {
		
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==from) {
				count++;
			}
		}
		
		String ans[]=new String[count+1];
		String temp="";
		int k=0;
		
		for (int i = 0; i < s.length(); i++) {
			
			if ((s.charAt(i)!=from)) {
				
				//System.out.println(i);
				temp+=s.charAt(i);
			}
			else {
				//System.out.println(temp);
				ans[k]=temp;
				k++;
				temp="";
			}
		}
		ans[k]=temp;
		return ans;
	}
}
