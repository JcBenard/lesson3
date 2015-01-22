/**
 * 
 */

/**
 * @author Jc
 *
 */
public class SUV extends Vehicle {

	/**
	 * @param colour
	 * @param make
	 * @param model
	 * @param year
	 */
	public SUV(String colour, String make, String model, String year) {
		super(colour, make, model, year);
		
		this.numDoors = 5;
	}

	/* (non-Javadoc)
	 * @see Vehicle#accelerate()
	 */
	@Override
	public void accelerate() {
		this.speed += 4; 
		
		if(this.speed >= this.MAX_SPEED){
			this.speed = this.MAX_SPEED;
		}

	}

	/* (non-Javadoc)
	 * @see Vehicle#decelerate()
	 */
	@Override
	public void decelerate() {
		this.speed -= 6;
		
		if(this.speed < 0){
			this.speed = 0;
		}
	}

}
