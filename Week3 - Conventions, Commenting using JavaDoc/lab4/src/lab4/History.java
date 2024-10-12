package lab4;

public class History extends Social {
	
	private String name = "History";
	/**
	 * toString method to return all the values associated with 'History' class
	 * 
	 * History class is orientated to an object in the Driver
	 * 
	 * @return classSlot() from the subject parent class
	 */
	public String toString() {
		return classSlot();
	}
	/*
	 * constructor for history class
	 * 
	 * super.var is used to pull from parent class and apply to static var creditMax
	 * super.var is used again to pull from parent class and apply to private static name
	 */
	public History() {	
		super.credit = creditMax;
		super.name = name;
	}

}
