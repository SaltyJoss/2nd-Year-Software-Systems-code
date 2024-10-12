package lab4;

public abstract class Social extends Subject {
	/*
	 * variables
	 */
	public static int creditMax = 50;// static because it does not need to be changed in the classes that use it
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
