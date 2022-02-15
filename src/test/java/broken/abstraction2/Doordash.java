package broken.abstraction2;

public interface Doordash {
	
	/*
	 * this is not a class
	 * interfaces do not have constructor
	 * classes are templates make objects
	 * interfaces are templates to make classes
	 */
	
	//	public Doordash(String name, int duration) {	
	//		System.out.println("Name:" + name);
	//		System.out.println("Duraiton:" + duration);
	//	}
	
	
	public abstract void delivery();	
	
	public abstract void fee();	
	
	/*
	 * I have java 1.7 for this folder
	 * 1.7 does not support default
	 * 	>had to change to public
	 */
	public abstract void pickUp();
	
	/*
	 * I have java 1.7 for this folder
	 * 1.7 does not support default
	 * 	>had to change to public
	 * 
	 * We do not provide implementation for the abstract methods
	 * 	>these are implicitly public abstract methods
	 * 
	 * should be string return type
	 */
	public String getLocation();
	
	/*
	 * 1.7 does not support static that is for 1.8
	 * 	>replaced with abstract
	 * 	> remove implementation
	 */
	
	public abstract void setLocation(String location);	
	
}