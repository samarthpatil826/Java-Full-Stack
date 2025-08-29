package collections;

public class LinkedSetDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedSet l1= new LinkedSet();
		
		
		l1.addVal(10);
		l1.addVal(20);
		l1.addVal(10);
		l1.addVal(40);
		l1.addVal(50);
		l1.addVal(40);
		
		l1.addFirst(50);
		
		
		System.out.println(l1);
	}

}
