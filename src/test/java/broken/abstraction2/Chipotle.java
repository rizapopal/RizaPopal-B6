package broken.abstraction2;

//this class should inherit DoorDash && Healthy
public class Chipotle implements Doordash, Healthy{

	/**
	 * need to override all abstract methods the two interfaces have
	 * and provide implementation
	 */
	
	@Override
	public int getCalories(int type) {
		return type;
		
	}

	@Override
	public void setCalories() {
		int type = 100;
		
	}

	@Override
	public void delivery() {
		System.out.println("Doordash");
		
	}

	@Override
	public void fee() {
		System.out.println("$25");
		
	}

	@Override
	public void pickUp() {
		
	System.out.println("Order has been picked up");
		
	}

	@Override
	public String getLocation() {
		String location = "Location";
		return location;
	}

	@Override
	public void setLocation(String location) {
		System.out.println(location);
		
	}

		
}