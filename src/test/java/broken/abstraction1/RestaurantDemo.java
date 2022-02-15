package broken.abstraction1;

public class RestaurantDemo {
	
	/*
	 * need to capitalize String
	 * and remove ;
	 */
	public static void main(String[] args) {
		
		/*
		 * we cannot create an object of abstract class restaurant
		 * we need to pass parameters to constructor
		 */
		FastFood obj1 = new FastFood("Chiptole", 7, 0);
		obj1.location();
		System.out.println(obj1.DISCOUNT);
		
		/*
		 * fix restaurant class name
		 * up casting of abstract reference to child concrete is allowed 
		 * but here we need to pass parameters to the constructor
		 * we cannot use non - overridden methods 
		 */
		Restaurant obj2 = new FastFood("McDonalds", 10, 10);
		//		obj2.getInfo();
		//		obj2.setInfo();
		
		/*
		 * cannot override final variable values
		 *  >but we can out put it
		 * fix constructor name and add corrected parameters
		 * 
		 * menu methods do not return string 
		 * 	>they should be outside of the print method
		 */
		FastFood obj3 = new FastFood("John Cena Restaurant", 12, 5);
		
		System.out.println(obj3.DISCOUNT);
		obj3.dinnerMenu();
		obj3.lunchMenu();
		
		
	}
 

}