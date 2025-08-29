package collections;

public class LinkedSet extends LinkedList{

	public LinkedSet() {
		
	}
	
	public boolean addVal(Object val) {
		
		if (!contains(val)) {
			
			return super.addVal(val);
		}
		return false;
	}
	
	public boolean addAll(LinkedList ref) {
		
		Node head=ref.iterate();
		
		while (head!= null) {
	
			if (!contains(head.val)) {
				
				super.addVal(head.val);
			}
			
			head=head.nextRef;
		}
		return true;
	}
	
	public boolean addFirst(Object val) {
		
		if (!contains(val)) {
			
			return super.addFirst(val);
		}
		return false;
	}
	
	public boolean addLast(Object val) {
		
		if (!contains(val)) {
			
			return super.addLast(val);
		}
		
		return false;
	}
}
