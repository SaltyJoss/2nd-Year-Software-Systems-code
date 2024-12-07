package vehicles;

/**
 * A kind of vehicle that represents a passenger train.
 * 
 * @author mdixon
 */
public class Train extends Vehicle {

	/**
	 * The number of passengers that the train can carry.
	 */
	private int passengerCount;
	
	/**
	 * The maximum range of the train
	 */
	private int maxRange;
	
	///////////////////////////////////////////////////////////////////////

	@Override
	public double getMaxRange() {
		
		// TODO PART1 : return the max range of train
		return maxRange;
	}
	
	/**
	 * Sets the max range
	 * 
	 * @param maxRange the max range
	 */
	public void setMaxRange(int maxRange) {
		
		this.maxRange = maxRange;
	}
	
	/**
	 * @return the number of passengers that the train can carry.
	 */
	public int getPassengerCount() {
		
		// TODO PART1 : return the number of passengers
		return passengerCount;
	}

	/**
	 * Sets the passengerCount
	 * 
	 * @param passengerCount the number of passengers that the train can carry.
	 */
	public void setPassengerCount(int passengerCount) {
		
		// TODO PART1 : set the number of passengers
		this.passengerCount = passengerCount;
	}

	/**
	 * Gets the estimated length of the train.
	 * 
	 * The train length is estimated as being 3.2 metres for each of its wheels.
	 * 
	 * @return the estimated length of the train.
	 */
	public double getTrainLength() {
		
		// TODO PART1 : calculate the estimated length of the train and return
		double estLen;
		estLen = 3.2 * getWheels();
		
		return estLen;
	}
	
	///////////////////////////////////////////////////////////////////////

	
	/**
	 * Constructor
	 * 
	 * Creates a train.
	 * 
	 * By default a train can carry 125 passengers, and has a range of 200.
	 * 
	 * @param wheels the number of wheels
	 * @param model the model name of the vehicle
	 * @param regNo the registration number of the vehicle
	 */
	public Train(int wheels, String model, String regNo) {
		
		// TODO PART1 : pass the correct number of wheels, model name, and regNo to the super() type constructor.
		super(wheels, model, regNo);
		
		// TODO PART1 : set the range and passenger count attributes to the default values specified in the javadoc comment of the method.
		maxRange = 200;
		passengerCount = 125;
	}
	
}
