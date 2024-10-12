package lab4;

public class Math extends Science{
	private String name = "Math";
	/**
	 * toString method to return all the values associated with 'Math' class
	 * 
	 * Math class is orientated to an object in the Driver
	 * 
	 * @return classSlot() from the subject parent class
	 */
	public String toString() {
		return classSlot();
	}
	/*
	 * constructor for math class
	 * 
	 * super.var is used to pull from parent class and apply to static var creditMax
	 * super.var is used again to pull from parent class and apply to private static name
	 */
	public Math() {
		super.credit = creditMax;
		super.name = name;
	}
}
