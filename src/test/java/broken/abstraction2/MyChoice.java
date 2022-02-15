package broken.abstraction2;

//This class should inerhit Subway
/*
 * inherits for classes is extends keyword
 */
public class MyChoice extends Subway {
	
	/*
	 * need to state argument constructor of subway class
	 * so create a constructor of this class that calls on it
	 */
	
	public MyChoice(String name, int duration) {
		
		super(name, duration);
		
		System.out.println("MyChoice Constructor");
	}
	
	/*
	 * overridden methods:
	 * -should have same method name and parameters (method signature)
	 * -less restrictive or same access modifier
	 * >fix spelling
	 * 
	 * 
	 */
	@Override 
	public void setPrice(double price) {
		System.out.println("New : " + price);
	}

}