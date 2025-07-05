package wrapper;

public class StringToPrimitive {

	public static void main(String[] args) {
		
		String s1= "123";
		
		int i= Integer.parseInt(s1);
		System.out.println(i);
		
		String s2= "234";
		
		char ch= s2.charAt(2);
		System.out.println(ch);
		
		String s3="230.04343500";
		
		double d= Double.parseDouble(s3);
		System.out.println(d);
		System.out.println("-------------------------------------");
		
		float f= Float.parseFloat(s3);
		System.out.println(f);
	}

}
