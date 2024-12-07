package vehicles;

/**
 * An abstract vehicle class.
 * 
 * NOTE: This file does not need changing as part of the solution. It is already fully complete.
 * 
 * @author mdixon
 */
public abstract class Vehicle {

	/**
	* The number of wheels of the vehicle
	*/
	final private int wheels;
	
	/**
	 * The model name of the vehicle.
	 */
	final private String model;

	/**
	 * The registration number of the vehicle
	 */
	final private String regNo;
	
	///////////////////////////////////////////////////////////////////////
		
	/**
	* Gets the vehicle's maximum range.
	*
	* @return the vehicle's maximum range
	*/
	abstract public double getMaxRange();

	/**
	 * @return the number of wheels
	 */
	public int getWheels() {
		
		return wheels;
	}
	
	/**
	 * @return the model name of the vehicle
	 */
	public String getModel() {
		
		return model;
	}

	/**
	 * @return the registration number of the vehicle
	 */
	public String getRegistration() {
		
		return regNo;
	}

	///////////////////////////////////////////////////////////////////////
	
	/**
	 * Constructor
	 * 
	 * @param wheels the number of wheels
	 * @param model the model name of the vehicle
	 * @param regNo the registration number of the vehicle
	 */
	Vehicle(int wheels, String model, String regNo) {
		
		this.wheels = wheels;
		this.model = model;
		this.regNo = regNo;
	}
}
