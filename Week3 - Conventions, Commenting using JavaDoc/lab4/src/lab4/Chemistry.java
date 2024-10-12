package lab4;

public class Chemistry extends Science{
	
	private String name = "Chemistry";
	/**
	 * toString method to return all the values associated with 'Chemistry' class
	 * 
	 * Chemistry class is orientated to an object in the Driver
	 * 
	 * @return classSlot() from the subject parent class
	 */
	public String toString() {
		return classSlot();
	}
	/*
	 * constructor for chemistry class
	 * 
	 * super.var is used to pull from parent class and apply to static var creditMax
	 * super.var is used again to pull from parent class and apply to private static name
	 */
	public Chemistry() {
		super.credit = creditMax;
		super.name = name;
	}
}
