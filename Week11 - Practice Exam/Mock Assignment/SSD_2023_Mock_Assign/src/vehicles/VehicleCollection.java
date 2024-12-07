package vehicles;

/**
 * An interface that defines methods to be implemented by vehicle collection classes.
 * 
 * @author mdixon
 */
public interface VehicleCollection {

	/**
	 * Adds a vehicle to the collection.
	 * 
	 * @param vehicle the vehicle to be added
	 * @return the total number of vehicles within the collection
	 */
	int addVehicle(Vehicle vehicle);

	/**
	 * Removes a vehicle from the collection.
	 * 
	 * @param vehicle the vehicle to be removed
	 * @return true if the vehicle was found and removed, else false
	 */
	boolean removeVehicle(Vehicle vehicle);

	/**
	 * Checks if the collection contains a given vehicle.
	 * 
	 * @param vehicle the vehicle to be found
	 * @return true if the collection contains the vehicle, else false
	 */
	boolean containsVehicle(Vehicle vehicle);

	/**
	 * Gets the total number of vehicles in the collection.
	 * 
	 * @return the total number of vehicles in the collection
	 */
	int vehicleCount();

	/**
	 * Removes all vehicles from the collection
	 */
	void clearAllVehicles();
	
	/**
	 * Gets the vehicle with the largest range within the collection.
	 * 
	 * Even if a vehicle's range changes after it is added to the collection, the vehicle with the largest range should always be returned.
	 * 
	 * @return the vehicle with the largest range, null if no vehicles exist within the collection.
	 */
	Vehicle getLargestRange();
		
	/**
	 * Counts the number of vehicles which are of the specified model.
	 * 
	 * If a null value is given for the model, then 0 is always returned.
	 * 
	 * The case of the given model is ignored, e.g. "ford", "FORD" and "Ford" are treated as the same model.
	 * 
	 * @param model the name of the model to be counted.
	 * @return the number of vehicles within the collection which are of the specified model.
	 */
	int countVehiclesOfModel(String model);
	
	/**
	 * Checks whether any vehicles have the given registration number.
	 * 
	 * If a null value is given for the registration number, then false is always returned.
	 * 
	 * The case of the given regNo is important, e.g. "LS12 2PF", is NOT the same as "LS12 2pf"
	 * 
	 * @param regNo registration number to be checked
	 * @return true if at least one vehicle has the given registration number, else false.
	 */
	boolean containsVehicleWithReg(String regNo);
	
}
