package abstraction;

public abstract class Calculator {
	
	public abstract void addition(int a1, int a2);
	
	public abstract void subtraction(int n1, int n2);
	
	public abstract void multiplication(int x1, int x2);
	
	public void division(int num1, int num2) {
		System.out.println(num1/num2);
	}
	
	
	

}
