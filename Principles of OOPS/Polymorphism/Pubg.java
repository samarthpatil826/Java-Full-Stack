package polymorphism;

public class Pubg {
	
	int bullets=30;
	
	public void turnLeft() {
		
		System.out.println("turned right");
	}
	
    public void turnRight() {
		
		System.out.println("turned right");
	}
    
    public void forward(int steps) {
    	System.out.println("went "+ steps+" steps forward");
    }
    
    public void backward(int steps) {
    	System.out.println("went "+steps+" steps forward");
    }
    
    public void fire() {
    	
    	if (bullets>0) {
    		
    		bullets--;
    		System.out.println("fired !!");
    		System.out.println(bullets);
			
		} else {
			bullets=30;
			System.out.println("reloaded");

		}
    }

}
