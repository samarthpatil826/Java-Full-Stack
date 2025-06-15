package abstraction;

public abstract class Shapes {
	
	public abstract void areaOfSquare(int a);
	
	public abstract void areaOfRectangle(int l, int w);
	
	public abstract void areaOfCircle(double r);
	
	public abstract void areaOfTriangle(int b, int h);
	
	
	public void perimeterSquare(int a) {
		System.out.println(4*a);
	}
	
	public void perimeterRectangle(int l, int w) {
		System.out.println(2*(l+w));
	}
	
	public abstract void perimeterTriangle(int a, int b, int c);
	
	public abstract void circumferenceOfCircle(double r);

}
