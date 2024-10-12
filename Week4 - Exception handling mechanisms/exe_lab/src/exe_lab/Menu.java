package exe_lab;

public class Menu {
	
	private int optNo, opt;
	/**
	 * diplayMenuOption method
	 * 
	 * uses switch() to show what menu has been selected
	 * 
	 * @param opt
	 * @throws InvalidOptionException
	 */
	void displayMenuOption(int opt) throws InvalidOptionException{
		this.opt = opt;
		
		switch(opt) {
			case 1:
				optNo = opt;
				break;
			case 2:
				optNo = opt;
				break;
			case 3:
				optNo = opt;
				break;
			default:
				throw new InvalidOptionException("ERROR: Invalid Option selected!");
				
		}
	}
	
	public String toString() {
		String message = "Invalid Option selected!";
		
		InvalidOptionWindow errMsg = new InvalidOptionWindow(message);
		
		try {
			displayMenuOption(opt);
		} catch (InvalidOptionException e) {
			errMsg.errorDialog(message);
			e.printStackTrace();
		}
		return "Selected Menu number: " + optNo;
	}
	
	/**
	 * empty constructor to be initialized by driver
	 */
	public Menu() {
	}
}
