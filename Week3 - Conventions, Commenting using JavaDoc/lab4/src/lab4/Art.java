package lab4;

public class Art extends Subject{
	/*
	 * variables
	 */
	private String name = "Art";
	private static int creditMax = 200;
	/**
	 * Art is not part of a specific subject, as it is it's own subject.
	 * Therefore, it extends the parent class directly, but not as an abstract class.
	 * So it has to have a getCredit() method within it, and define it's credit amount.
	 */
	
	/**
	 * getCredit() method
	 * 
	 * @return credtiMax
	 */
	@Override
	public int getCredit() {
		return creditMax;
	}
	/**
	 * toString method to return all the values associated with 'Art' class
	 * 
	 * Art class is orientated to an object in the Driver
	 * 
	 * @return classSlot() from the subject parent class
	 */
	public String toString() {
		return classSlot();
	}
	/*
	 * constructor for Art class
	 * 
	 * super.var is used to pull from parent class and apply to static var creditMax
	 * super.var is used again to pull from parent class and apply to private static name
	 */
	public Art() {
		super.credit = creditMax;
		super.name = name;
	}
}
