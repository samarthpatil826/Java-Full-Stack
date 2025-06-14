package polymorphism;

public class Test2 extends Test1 {
	
	String a="Hi";
	static String b="Bye";
	
	public static void demo() {
		
		System.out.println("From static demo of Test2");
	}
	
	public void test() {
		System.out.println("from non static test of Test2");
	}

}
