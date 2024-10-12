package lab4;

public class Geography extends Social {
	
	private String name = "Geography";
	/**
	 * toString method to return all the values associated with 'Geography' class
	 * 
	 * Geography class is orientated to an object in the Driver
	 * 
	 * @return classSlot() from the subject parent class
	 */
	public String toString() {
		return classSlot();
	}
	/*
	 * constructor for geography class
	 * 
	 * super.var is used to pull from parent class and apply to static var creditMax
	 * super.var is used again to pull from parent class and apply to private static name
	 */
	public Geography() {
		super.credit = creditMax;
		super.name = name;
	}
}
