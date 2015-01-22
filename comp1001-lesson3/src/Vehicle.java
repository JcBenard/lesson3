/**
 * @author Jc
 *Class Description: Creating a vehicle class to use as a super class for all other vehicle subclasses
 */
public abstract class Vehicle {

	//private properties///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	protected int numWheels = 4;
	protected int numDoors = 2;
	protected String colour = "";
	protected String make = "";
	protected String model = "";
	protected String year = "";
	protected float speed = 0;
	protected final int MAX_SPEED = 40;
	
	//Getter methods///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * @return the number of wheels
	 */
	public int getNumWheels() {
		return this.numWheels;
	}

	/**
	 * @return the number of doors
	 */
	public int getNumDoors() {
		return this.numDoors;
	}

	/**
	 * @return the colour
	 */
	public String getColour() {
		return this.colour;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return this.make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return this.model;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return this.year;
	}

	/**
	 * @return the speed
	 */
	public float getSpeed() {
		return this.speed;
	}
	
	//constructors///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public Vehicle(int numWheels, int numDoors, String colour, String make, String model, String year){
		this.numWheels = numWheels;
		this.numDoors = numDoors;
		this.colour = colour;
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public Vehicle(String colour, String make, String model, String year){
		this.colour = colour;
		this.make = make;
		this.model = model;
		this.year = year;
	}
	//public methods////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Must be overwritten
	public abstract void accelerate();
	
	public abstract void decelerate();
	
	public void turnLeft(){
		System.out.println("Turning Left");
	}
	
	public void turnRight(){
		System.out.println("Turning Right");
	}
}
