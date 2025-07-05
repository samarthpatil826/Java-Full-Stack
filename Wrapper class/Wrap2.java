package wrapper;

public class Wrap2 {

	public static void main(String[] args) {
		
		//Unboxing
		
		Integer i= new Integer(500);
		int i1= i.intValue();
		System.out.println(i1);
		
		Byte b= new Byte((byte) 100);
		byte b1=b.byteValue();
		System.out.println(b1);
		
		Short s= new Short((short)300);
		short s1= s.shortValue();
		System.out.println(s1);
		
		Long l= new Long(12346l);
		long l1= l.shortValue();
		System.out.println(l1);
		
		Character c= new Character('s');
		char ch = c.charValue();
		System.out.println(ch);
		
		Float f= new Float(10.20);
		float f1=f.floatValue();
		System.out.println(f1);
		
		Double d= new Double(140.24596);
		double d1= d.doubleValue();
		System.out.println(d1);
		
		Boolean bb= new Boolean(true);
		boolean bb1= bb.booleanValue();
		System.out.println(bb1);
	}

}
