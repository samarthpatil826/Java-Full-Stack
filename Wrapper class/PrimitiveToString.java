package wrapper;

public class PrimitiveToString {

	public static void main(String[] args) {
		
		int a=500;
		
		String s1= String.valueOf(a);
		System.out.println(s1+10);
		
		double d=120.304;
		
		String s2= String.valueOf(d);
		System.out.println(s2);
		
		Integer i= new Integer(200);
		
		String s3= String.valueOf(i);        
		System.out.println(s3);
	}

}
