package lab6;

import java.util.*;

public class NameManager {
	
	// List array initialised
	List<String> names = new ArrayList<String>();
	
	/**
	 * addName method
	 * adds given name to the list
	 * @param name
	 */
	public void addName(String name) {
		
		names.add(name);
	}
	
	/**
	 * printName method
	 * iterates over the list for names, then prints it console.
	 */
	public void printNames() {
		
		Iterator<String> iter = names.iterator();
		
		System.out.println("NAMES: ");
		
		while(iter.hasNext()) {
			String name = iter.next();
			System.out.println("Next name in list:\t" + name);
		}
		
		System.out.println("\n");

	}
	
	/**
	 * removeLongName method
	 * iterates over the list and checks if names found are longer than 15 char, if true remove from list
	 * takes no parameters
	 */
	public void removeLongNames() {
		
		Iterator<String> iter = names.iterator();
		
		while (iter.hasNext()) {
			
			String name = iter.next();
			
			if (name.length() > 15)
				iter.remove();
		}
	}
	
	/**
	 * Constructor for NameManager Class
	 * Empty, no need for parameters
	 */
	public NameManager() {
		
	}
}
