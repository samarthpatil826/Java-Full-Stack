package abstraction;

public class ShapesDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shapes s= new ShapesImp();
		
		s.areaOfRectangle(10, 12);
		
		s.perimeterSquare(15); // method not overriden ....present in parent class
		
		s.areaOfCircle(7);

	}

}
