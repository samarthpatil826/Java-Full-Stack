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
	
	
	public boolean contains(Object val) {
		
		return containsVal(val)!=null;
	}
	
	
	private Node containsVal(Object val) {
		
		Node head=iterate();
		
		while (head!=null) {
			
			if (((Integer)val).equals(((Integer)head.val))) {
				
				return head;
				
			}
			
			head=head.next();
		}
		return null;
	}
	
	
	public boolean removeVal(Object val) {
		
		Node ref= containsVal(val);
		
		if (ref.nextRef==null) {
			
			prior=ref.preRef;
			ref.preRef.nextRef=null;
			
			return true;
		} 
		
		else if (ref.preRef==null) {
			
			head=ref.nextRef;
			head.preRef=null;
			
			return true;
		}
		
		else if (ref!=null) {
			
			ref.nextRef.preRef= ref.preRef;
			
			ref.preRef.nextRef= ref.nextRef;
			
			return true;
		}
		
		return false;
	}
	
	
	public boolean removeFirst() {
		
		if (head.preRef==null) {
			
			head=head.nextRef;
			head.preRef=null;
			
			return true;
		}
		return false;
	}
	
	
	public boolean removeLast() {
		
		prior = prior.preRef;    
	    prior.nextRef = null;  
	    
	    return true;
	}
	
	
	public boolean addFirst(Object val) {
		
		Node temp=new Node(val);
		
        if (head!=null) {
			
        	temp.nextRef=head;
        	head.preRef=temp;
        	head=temp;
     
		}
        
        else {
			head=prior=temp;
		}
        
		return true;
	}
	
	
	public boolean addLast(Object val) {
		
		return addVal(val);	
	}
	
	
	public boolean removeAll(LinkedList ref) {
		
		Node head= ref.iterate();
		
		while (head!=null) {
			
			if (contains(head.val)) {
				
				removeVal(head.val);
			}
			head=head.next();
			
		}
		return head==null;
	}
	
	public boolean retainAll(LinkedList ref) {
		
		LinkedList temp=new LinkedList();
		
		Node head= ref.iterate();
		
		while (head != null) {
			
			Node r= containsVal(head.val);
			
			if (r!= null) {
				
				temp.addVal(head.val);
			}
			head= head.next();
		}
		
		this.head = temp.head;
		this.prior = temp.prior;
		
		return true;
	}
	
	public boolean addAll(LinkedList ref) {
		
		Node head= ref.iterate();
		
		while (head !=null) {
			
			addVal(head.val);
			head= head.next();
		}
		
		return head==null;
	}
	
	public void clear() {
		
		head = null;
		prior=null;
	}
	
	public Node reverseIterate() {
		
		return prior;
	}
	
	
    public String toString() {
		
		if (head!=null) {
			
			Node head= iterate();
			
			StringBuilder sb= new StringBuilder();
			
			sb=sb.append("[");
			
			do {
				
				sb= sb.append(" "+head.val).append(",");
				
				head=head.next();
				
			} 
			while (head!= null);
			
			sb=sb.deleteCharAt(sb.length()-1);
			sb=sb.append("]");
		
			return new String(sb);
		}
		return "[]";
	}
}
