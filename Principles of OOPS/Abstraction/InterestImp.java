package abstraction;

public class InterestImp extends Interest{
	
	public void simpleInterest(double p, double r, int t) {
		System.out.println(p*r*t / 100);
	}
	
	public void compoundInterest(double p, double r, int n, int t) {
		System.out.println(p* Math.pow(1 + (r / (n*100)), n * t));
	}

}
