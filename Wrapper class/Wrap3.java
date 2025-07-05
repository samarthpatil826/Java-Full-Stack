package wrapper;

public class Wrap3 {

	public static void main(String[] args) {
		
		Integer i= new Integer(100);
		Byte b= new Byte((byte)100);
		
		System.out.println(i.equals(b)); // gives false because both objects are different we cannot comapre it because of differnt object
	}

}
