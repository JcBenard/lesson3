/**
 * @author Jc
 * 
 */
public class Truck extends Vehicle {

	//constructor//////////////////////////////////////////////////////////////////////////////////////////////////
	public Truck(int numWheels, int numDoors, String colour, String make, String model, String year) {
		super(numWheels, numDoors, colour, make, model, year);
		
		checkNumDoors();
	}
	
	//private methods//////////////////////////////////////////////////////////////////////////////////////////////
	private void checkNumDoors(){
		if(this.numDoors < 3){
			this.numDoors = 3;
		}
	}
	
	//Overridden methods///////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public void accelerate(){
		this.speed += 2; 
		
		if(this.speed >= this.MAX_SPEED){
			this.speed = this.MAX_SPEED;
		}
	}
	
	@Override
	public void decelerate(){
		this.speed -= 3;
		
		if(this.speed < 0){
			this.speed = 0;
		}
	}
}
