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
		
		LinkedList l2= new LinkedList();
		
		l2.addVal(10);
		l2.addVal(200);
		l2.addVal(30);
		l2.addVal(400);
		l2.addVal(50);
		
		l1.removeAll(l2);
		System.out.println(l1);
//		do {
//			
//			System.out.println(head.val);
//			head=head.next();
//		} 
//		while (head!=null);
	}

}
