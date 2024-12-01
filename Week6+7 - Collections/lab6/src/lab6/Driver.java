package lab6;

public class Driver {

	public static void main(String[] args) {
		
		NameManager manager = new NameManager();
		
		manager.addName("M.Mickleson");
		manager.addName("Joshua Taylor Briggs");
		manager.addName("P.Smith");
		manager.addName("Peter Jonathan Smython");
		manager.addName("P.Thompson");
		
		manager.printNames();
		
		manager.removeLongNames();
		
		manager.printNames();
	}

}
