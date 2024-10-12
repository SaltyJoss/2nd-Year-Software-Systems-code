package lab4;

public abstract class Science extends Subject{
	/*
	 * variables
	 */
	public static int creditMax = 100; // static because it does not need to be changed in the classes that use it
	/**
	 * getCredit() method
	 * 
	 * @return credtiMax
	 */
	@Override
	public int getCredit() {
		return credit;
	}
	
}
