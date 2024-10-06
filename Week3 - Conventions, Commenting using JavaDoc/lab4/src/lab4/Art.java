package lab4;

public class Art extends Subject{
	
	private static int credit = 200;
	
	@Override
	public int getCredit() {
		return credit;
	}
	
	public String toString() {
		return classSlot();
	}
	
	public Art() {
	}
}
