package vehicles;

import java.util.HashSet;
import java.util.Set;

/**
 * Implements the {@link VehicleCollection} interface using an underlying set.
 * 
 * @author mdixon
 */
public class VehicleSet implements VehicleCollection {

	/**
	 * The set of vehicles
	 */
	private Set<Vehicle> vehicles = new HashSet<Vehicle>();

	///////////////////////////////////////////////////////////////////////

	@Override
	public int addVehicle(Vehicle vehicle) {

		// TODO PART3 :add the vehicle to the list, then return the size of the list once added
		vehicles.add(vehicle);
		return vehicles.size();
	}

	@Override
	public boolean removeVehicle(Vehicle vehicle) {

		// TODO PART3 : remove the vehicle to the list, returning true if actually removed, else returning false.
		
		if (vehicles.contains(vehicle)) {
			vehicles.remove(vehicle);
			return true;
		}
			
		return false;
	}

	@Override
	public boolean containsVehicle(Vehicle vehicle) {

		// TODO PART3 : return true if the list contains the given vehicle, else return false.
		if (vehicles.contains(vehicle))
			return true;
		
		return false;
	}

	@Override
	public int vehicleCount() {

		// TODO PART3 : return the size of the list
		return vehicles.size();
	}

	@Override
	public void clearAllVehicles() {

		// TODO PART3 : remove all elements from the list
		vehicles.clear();
	}


	@Override
	public Vehicle getLargestRange() {

		Vehicle largest=null;

		// TODO PART3 : iterate the set, finding the vehicle with the largest range (hint: call getMaxRange() for each vehicle)
		double base=0;
		
		for (Vehicle v : vehicles) {
			if (v.getMaxRange() >= base)
				largest = v;
			
			base = v.getMaxRange();
		}
		
		return largest;
	}

	@Override
	public int countVehiclesOfModel(String model) {

		int count = 0;

		// TODO PART3 : Check if given model is null
		// TODO PART3 : iterate the set, counting the number of vehicles with the given model
		// hint: call getModel() for each vehicle and compare with given model using a method
		for (Vehicle v : vehicles)
			if (v.getModel().equalsIgnoreCase(model))
				count++;
				
		return count;
	}
	
	@Override
	public boolean containsVehicleWithReg(String regNo) {
		
		// TODO PART3 : Check if given regNo is null
		// TODO PART3 : iterate the set, check if any vehicles have the given regNo
		for (Vehicle v : vehicles)
			if (v.getRegistration().equals(regNo))
				return true;
		
		return false;
	}
	
	///////////////////////////////////////////////////////////////////////

}
