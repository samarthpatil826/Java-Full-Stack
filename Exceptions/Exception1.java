package exceptions;
import java.util.*;

public class Exception1 {

	public Exception1() {
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter the num : ");
			int a = sc.nextInt();
			System.out.println("Enter the den : ");
			int b = sc.nextInt();
			
			System.out.println(a/b);
		} 
		
		catch (ArithmeticException e) {
			
			System.out.println("dont divide by zero");
		}
		
		finally {
			System.out.println("byee");
			System.out.println("hii");
		}

	}

}
