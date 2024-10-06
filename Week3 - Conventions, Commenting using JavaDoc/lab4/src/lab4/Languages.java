package lab4;

public class Languages extends Social {
	private int credit = 50;
	
	@Override
	public int getCredit() {
		return credit;
	}
	
	public String toString() {
		return classSlot();
	}
	
	public Languages() {
	}
}
