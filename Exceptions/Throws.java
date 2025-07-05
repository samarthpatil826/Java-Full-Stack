package exceptions;

public class Throws {

	public Throws() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException 
	{
		
		for(int i=0; i<5; i++) {
			System.out.println("hello");
			Thread.sleep(2000);
		}
	}

}
