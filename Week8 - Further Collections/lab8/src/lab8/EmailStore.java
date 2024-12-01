package lab8;

import java.util.*;

public class EmailStore {
	
	Set<String> emailAddresses = new HashSet<String>();
	
	/**
	 * hasEmail method that checks for 
	 * @param email
	 * @return boolean value
	 */
	private boolean hasEmail(String email) {
		
		// 
		boolean exists;
		
		if (emailAddresses.contains(email)) {
			exists = false;
		} else {
			exists = true;
		}
		
		return exists;
	}
	
	/**
	 * addEmail void method that calls 
	 * @param email
	 */
	public void addEmail(String email) {
		
		if (!hasEmail(email)) {
			emailAddresses.add(email);
			System.out.println("DONE: email created");
		} else {
			System.out.println("ERROR: email already stored");
		}
			
	}
	
	/**
	 * displayEmail method that checks for string emails in emailAddresses and displays the outcome
	 * for loop to print each email
	 */
	public void displayEmails() {
		
		int c = 0; // counter
		
		for(String email : emailAddresses) {
			c++; // counter binary add
			System.out.println("Email " + c + ": " + email + ".\n");
		}
	}
	
	/**
	 * Empty constructor
	 */
	public EmailStore() {
		
	}
}
