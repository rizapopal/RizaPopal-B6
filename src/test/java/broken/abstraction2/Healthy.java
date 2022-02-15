package broken.abstraction2;

public interface Healthy {
	
	/*
	 * variables are implicitly public static final
	 * > need to be initialized
	 */
	
	int amount = 100; 
	public String name = "Food";
	
	/*
	 * we cannot have constructors in interfaces
	 */
	
	//	public Healthy(int calorie) {
	//		System.out.println("Calorie: " + calorie );
	//	}
	//	
	//	public Healthy(int calorie, int amount) {
	//		System.out.println("Amount: " + amount);
	//		System.out.println("Calorie:" + calorie);
	//	}
	
	/*
	 * we do not provide implementation for abstract methods
	 * calories should be integers and return integer
	 */
	public abstract int getCalories(int type);
	
	
	public abstract void setCalories();
}