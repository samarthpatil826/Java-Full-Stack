package collections;

public class LinkedListDriver {
	
	public static void main(String[] args) {
		
		LinkedList l1= new LinkedList();
		
		l1.addVal(10);
		l1.addVal(20);
		l1.addVal(30);
		l1.addVal(40);
		l1.addVal(50);
		l1.addVal(60);
		
		Node head = l1.iterate();
		
		do {
			
			System.out.println(head.val);
			head=head.next();
		} 
		while (head.hasNext());
	}

}
