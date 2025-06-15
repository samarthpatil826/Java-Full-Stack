package abstraction;

public class CalculatorDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c1 = new CalculatorImp();
		
		c1.addition(40, 30);//method overriding, it compiles the method of parent class but at runtime the same child method will executes
		
		c1.division(10, 2);

	}

}
