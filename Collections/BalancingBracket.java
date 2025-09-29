package collections;

import java.util.ArrayDeque;

public class BalancingBracket {
	
	public static boolean isBalanced(String s) {
		
		if (s.length()%2==0) {
			
			ArrayDeque<Character> ad= new ArrayDeque<Character>();
			
			for (int i = 0; i < s.length(); i++) {
				
				char ch= s.charAt(i);
				if (ch=='{' || ch=='[' || ch=='(') {
					
					ad.push(ch);
					
				} 
				else if (!ad.isEmpty() && ch=='}' && ad.peek()=='{' || ch==']' && ad.peek()=='[' || ch==')' && ad.peek()=='(' ) {
					
					ad.pop();
				}
				else {
					return false;
				}
				
			}
			return ad.isEmpty();
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="{[()]}";
		
		System.out.println(isBalanced(s)?"Balancing Brackets":"Not a Balancing Brackets");

	}

}
