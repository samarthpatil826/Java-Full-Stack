package collections;

public class Node {
	
	Object val;
	
	Node nextRef;
	
	Node preRef;
	
	Node currRef;
	
	private Node() {
		// TODO Auto-generated constructor stub
	}
	
	public Node(Object o) {
		
		val=o;
		currRef=this;
	}
	
	public Node next() {
		
		return nextRef;
	}
	
	public Node prev() {
		
		return preRef;
	}
	
	public boolean hasNext() {
		
		return nextRef != null;
	}
	
	public boolean hasPrev() {
		
		return preRef != null;
	}

}
