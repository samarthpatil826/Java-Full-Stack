package collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class CollectionImplementations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		
		al.add(100);
		al.add(60);
		al.add(150);
		al.add(130);
		al.add(70);
		al.add(100);
		al.add(70);
		al.add(300);
		al.add(110);
		al.add(130);
		
		System.out.println("ArrayList : "+al);
		
		HashSet<Integer> hs= new HashSet<Integer>(al);
		
		System.out.println("HashSet : "+hs);
		
		LinkedList<Integer> ll= new LinkedList<Integer>(al);
		
		System.out.println("LinkedList : "+ ll);
		
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>(al);
		
		System.out.println("ArrayDeque : "+ad);
		
		
		System.out.println(ll.get(4));

	}

}
