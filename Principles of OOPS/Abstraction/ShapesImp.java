package abstraction;

public class ShapesImp extends Shapes{
	
	double pie= 3.14;
	
	public void areaOfSquare(int a) {
		System.out.println(a*a);
	}
	
	public void areaOfRectangle(int l, int w) {
		System.out.println(l*w);
	}
	
	public void areaOfCircle(double r) {
		System.out.println(pie*r*r);
	}
	
	public void areaOfTriangle(int b, int h) {
		System.out.println(0.5*b*h);
	}
	
	public void perimeterTriangle(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void circumferenceOfCircle(double r) {
		System.out.println(2*pie*r);
	}

}