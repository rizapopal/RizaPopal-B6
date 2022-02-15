package broken.abstraction2;

public class DoorDashDemo {
	
	/*
	 * add main method
	 */
	
		public static void main(String[] args) {
			
		/*
		 * cannot create objects of interfaces
		 * we can up cast however
		 * 
		 */
		
		Doordash obj1 = new Subway("John", 123);	
		
		
		Healthy obj2 = new Subway("Hi", 100);
		
		/*
		 * cannot access non overridden methods
		 */
		Doordash obj3 = new Subway("New Subway", 165);
		//obj3.setPrice(22.22);
		
		/*
		 * up casting only works with inheritance
		 */
		Subway obj4 = new Subway("Name", 564);	
		obj4.fee();
		
		/*
		 * need to change object name
		 * up casting only works with inheritance
		 * we can change chipotle to subway
		 * 
		 * need to pass parameter to setPrice method
		 */
		Subway obj5 = new MyChoice("namehff", 545);	
		obj4.setPrice(5.00);
			
		/*
		 * need to pass parameters
		 * use polymorphism idea to let parent reference point to a different object
		 */
		obj5 = new Subway("name23", 8978);
		
		/*
		 * these variables are final
		 * cannot change only call on final variables
		 */
		
		//obj5.amount = 22;
		//obj5.name = "MD";
		
		System.out.println(obj5.amount);
		System.out.println(obj5.name);
		
		}
}