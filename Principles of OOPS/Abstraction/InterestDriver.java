package abstraction;

public class InterestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interest i = new InterestImp();
		
		i.simpleInterest(500, 7, 10);
		
		i.compoundInterest(5000, 7, 20, 15);

	}

}
