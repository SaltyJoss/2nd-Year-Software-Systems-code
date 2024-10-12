package exe_lab;

public class Driver {
	
	/**
	 * Driver class to create and run objects
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		ArrayProcessor ap = new ArrayProcessor(); // object creation of class ArrayProcessor
		Menu menuOpt = new Menu();
		
		int len = ap.getArrayLength(new String[] {"One", "Two", "Three"}); // using the .getArrayLength() method
		
		System.out.println("Length: " + len);
		System.out.println("Menu selected: \n" + menuOpt.toString());
	}

}
