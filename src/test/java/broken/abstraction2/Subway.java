package broken.abstraction2;

// this class should inerhit DoorDash && Healthy
/*
 * inheritting interfaces 
 *  > implements seperated by commas as so:
 */
	public class Subway implements Doordash, Healthy {
	
	/*
	 * interfaces do not have constructors
	 * we do not call super
	 */
	public Subway(String name, int duration) {
		//super(name, duration);
		
		System.out.println("name:" + name);
		System.out.println("duration: " + duration);	
	}
	
	public void setPrice(double price) {
		System.out.println("Price: "+ price);
	}
	
	/**
	 * Need to override all methods from interfaces
	 * and provide implementation
	 */
	
	@Override
	public void delivery() {
		
		System.out.println("Doordash delivery");
		
	}
	
	@Override
	public void fee() {
		
		System.out.println("fee: $30");
		
	}
	
	@Override
	public void pickUp() {
		
		System.out.println("order has been picked up");
		
	}
	
	@Override
	
	public String getLocation() {
		
		String location =" 100 sugar lane";
		return location;
		
	}
	
	@Override
	public void setLocation(String location) {
		
		System.out.println("Location is: " + location);
		
	}
	
	@Override
	public int getCalories(int type) {
		
		return type;
		
	}
	
	@Override
	public void setCalories() {
		
		System.out.println("100 calories");
	}
	
}