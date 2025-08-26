package collections;

public class LinkedList {
	
	Node head;
	Node prior;
	
	public LinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean addVal(Object val) {
		
		if (head==null) {
			
			head=new Node(val);
			prior=head;
			
		} 
		else {
			Node temp= new Node(val);
			prior.nextRef= temp;
			temp.preRef=prior;
			prior= temp;
		}
		
		return true;
	}
	
	public Node iterate() {
		
		return head;
	}

}
