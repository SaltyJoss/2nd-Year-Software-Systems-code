package lab4;

public class Languages extends Social {
	
	private String name = "Languages";
	private static int creditMax = 80;
	/**
	 * toString method to return all the values associated with 'Languages' class
	 * 
	 * Language class is orientated to an object in the Driver
	 * 
	 * @return classSlot() from the subject parent class
	 */
	public String toString() {
		return classSlot();
	}
	/*
	 * constructor for languages class
	 * 
	 * Language subject has a different credit than the class it extends
	 * 
	 * super.var is used to pull from parent class and apply to static var creditMax
	 * super.var is used again to pull from parent class and apply to private static name
	 */
	public Languages() {
		super.credit = creditMax;
		super.name = name;
	}
}
