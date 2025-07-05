package wrapper;

import java.util.HexFormat;

public class Wrap1 {

	public static void main(String[] args) {
		
		
		//Boxing
		
		Integer i1= new Integer(100);
		System.out.println(i1);
		
		Byte b= new Byte((byte)50);
		System.out.println(b);
		
		Short s= new Short((short)200);
		System.out.println(s);
		
		Long l= new Long(1234567l);
		System.out.println(l);
		
		Character c= new Character('a');
		System.out.println(c);
		
		Boolean b1= new Boolean(true);
		System.out.println(b1);
		
		Double d1= new Double(120.40);
		System.out.println(d1);
		
		Float f= new Float(11.0);
		System.out.println(f);
		
	}

}
