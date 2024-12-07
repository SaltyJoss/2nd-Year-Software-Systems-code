package vehicles;

/**
 * A kind of vehicle that represents a private car.
 * 
 * @author mdixon
 */
public class Car extends Vehicle {

	/**
	 * The size of the fuel tank (in gallons). If 0 the car is electric.
	 */
	private int tankSize;
	
	/**
	 * The range of the vehicle (total range if electric, otherwise a per-gallon range)
	 */
	private int range;
	
	///////////////////////////////////////////////////////////////////////

	@Override
	public double getMaxRange() {

		// TODO PART2 : Calculate and return the max range using the tankSize multiplied by the range (unless electric).
		// If the tankSize is zero return the range only (since the car is electric).
		if (tankSize > 0)
			return tankSize * range;
		
		return range;
	}
	
	
	/**
	 * @return the tankSize
	 */
	public int getTankSize() {
		
		// TODO PART2 : return the tank size
		return tankSize;
	}

	/**
	 * Sets the tankSize
	 * 
	 * @param tankSize the tankSize
	 */
	public void setTankSize(int tankSize) {
		
		// TODO PART2 : set the tank size
		this.tankSize = tankSize;
	}

	/**
	 * @return the range per gallon.
	 */
	public int getRange() {
		
		// TODO PART2 : return the range
		return range;
	}

	/**
	 * @param range the range per gallon.
	 */
	public void setRange(int range) {
		
		// TODO PART2 : set the range
		this.range = range;
	}

	/**
	 * @return true if the car is electric (has a tank size of 0)
	 */
	public boolean isElectric() {
		
		// TODO PART2 : return true if the car is electric
		if (tankSize > 0)
			return false;
		
		return true;
	}
	
	///////////////////////////////////////////////////////////////////////

	
	/**
	 * Constructor
	 * 
	 * Creates a car (which always has 4 wheels).
	 * 
	 * By default a car is has a range of 100, and a tank size of 0 (it is electric).
	 * 
	 * @param wheels number of wheels
	 * @param model the model name of the vehicle
	 * @param regNo the registration number of the vehicle
	 */
	public Car(String model, String regNo) {
		
		// TODO PART2 : pass the correct number of wheels, model name, and regNo to the super() type constructor.
		super(4, model, regNo);
		
		// TODO PART2 : set the range and tank size attributes to the default values specified in the javadoc comment of the method.
		int range = 100;
		int tankSize = 0;
		
		this.range = range;
		this.tankSize = tankSize;
	}
	
}
