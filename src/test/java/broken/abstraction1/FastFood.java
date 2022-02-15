package broken.abstraction1;

/*
 * change to extends
 * we want to inherit from an abstract class
 * Restaurant is an abstract class not interface
 */
public  class FastFood extends Restaurant {
	
	/*
	 * need to explicitly call on parent constructor because it has arguments
	 * and is not a default constructor
	 */
	public FastFood(String name, int luckyNumber, int waitTime) {
		super(name, luckyNumber, waitTime);
		System.out.println("This is the fast food constructor");
	}
	/*
	 * provided override annotation
	 * cannot be more restrictive when overriding change protected to public
	 */
	@Override
	public void location() {
		System.out.println("Reston VA");
	}
	
	/*
	 * upper case o for override annotation
	 * in our abstract class, this method is static
	 * we cannot override. comment out.
	 * we could call it by className.staticMethodName in other methods
	 * however
	 */
	
	//@Override
	//public void setOperationTime() {
	//	System.out.println("24/7");
	//}
	
	/*
	 * need to override all abstract methods
	 */
	@Override
	public void specialMenu() {
		System.out.println("No special menu");
	}
	
	/*
	 * John Cena Default Access modifier
	 * default = more restrictive than public
	 * we cannot override with a more restrictive access modifier = change to public
	 * 
	 * We cannot change method signature when overriding
	 * remove parameter
	 * we will have to hard code
	 */
	@Override
	public void lunchMenu() {
		
		System.out.println("Time: 12PM - 3PM");
	}
	
	/*
	 * replace protected with public
	 * cannot be more restrictive
	 * need same name as super method (F to f) and (m to M)
	 * when overriding need same return type
	 */
	@Override
	public void breakfastMenu() {
		System.out.println("Not serving...");
	}
	
	/*
	 * add return type void
	 * spell correctly add an 'n'
	 */
	@Override 
	public void dinnerMenu() {
		System.out.println("7PM-10PM");
	}
	
	@Override
	public void rating() {
			System.out.println("7/10");
	}
	
	/*
	 * cannot override final variable
	 * luckyNumber is an int not double
	 * waitTime is not string its int change to 0
	 * we do not out print methods by themselves
	 * rating needs to be overridden and called directly 
	 * because non static method inside non static method
	 */
	
	public void display() {
		
		//DISCOUNT = 30.00;
		
		System.out.println(DISCOUNT);
		
		luckyNumber = 22;
		
		System.out.println(luckyNumber);
		
		waitTime = 0;
		
		System.out.println(waitTime);
		
		rating();
	}
	
	/*
	 * these methods should not be abstract
	 */
	public void getInfo() {
		System.out.println("This is info");
	}
	public void setInfo() {
	
	}

}