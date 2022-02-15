package broken.abstraction1;


public abstract class Restaurant {
	
	public final double DISCOUNT = 20.00;
	public int luckyNumber= 12;
	public  int waitTime= 20;
	public String name;
	
	/*
	 *  use this keyword to differentiate between parameter name and instance variable
	 */
	
	public Restaurant(String name, int luckyNumber, int waitTime) {
		this.name = name;
		this.luckyNumber = luckyNumber;
		this.waitTime = waitTime;
		
		System.out.println(this.name);
		System.out.println(this.waitTime);
		System.out.println(this.luckyNumber);
	}
	
	
	/*
	 * abstract method cannot be static 
	 * because static methods cannot be overridden and abstract needs to be overridden
	 */
	
	public abstract void location();
	
	public static void setOperationTime() {
		System.out.println("Monday-Friday");
	}
	
	/*
	 * should be abstract since menu is dependent on restaurant sub type
	 * if abstract --> cannot be final
	 * because final methods cannot be overridden and abstract needs to be overridden
	 */
	
	public abstract void specialMenu();
	
	//note: this is public method because java 1.8 implicitly makes methods public abstract
	abstract void rating();
	
	//abstract methods do not provide implementation
	public abstract void breakfastMenu();
	
	public abstract void lunchMenu();

	public abstract void dinnerMenu();
}