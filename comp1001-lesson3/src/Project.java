/**
 * @author Jc
 * @version 3 - Added truck and suv class, make vehicle class into abstract
 * Program Description: Demo files for lesson 3
 */

public class Project {

	/**
	 * Main method for project
	 * @param args
	 */
	
	public static void main(String[] args) {		
		SUV honda = new SUV("Black", "Honda", "Pilot", "2015");
		Truck ford = new Truck(6, 3, "White", "Ford", "FX", "2008");
		
		for(int seconds = 0; seconds <= 10; seconds++){
			honda.accelerate();
			ford.accelerate();
		}
		
		System.out.println("SUV speed: " + honda.getSpeed());			
		System.out.println("Truck speed: " + ford.getSpeed());	
	}
}
