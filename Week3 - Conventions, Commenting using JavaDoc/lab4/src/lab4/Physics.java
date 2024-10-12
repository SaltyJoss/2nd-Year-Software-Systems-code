package lab4;

public class Physics extends Science{
	
	private String name = "Physics";
	/**
	 * toString method to return all the values associated with 'Physics' class
	 * 
	 * Physics class is orientated to an object in the Driver
	 * 
	 * @return classSlot() from the subject parent class
	 */
	public String toString() {
		return classSlot();
	}
	/*
	 * constructor for Physics class
	 * 
	 * super.var is used to pull from parent class and apply to static var creditMax
	 * super.var is used again to pull from parent class and apply to private static name
	 */
	public Physics() {
		super.credit = creditMax;
		super.name = name;
	}
}
