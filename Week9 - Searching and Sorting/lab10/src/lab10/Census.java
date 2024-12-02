package lab10;

import java.util.*;

public class Census {
	
	private List<Person> people = new ArrayList<Person>();
	
	/**
	 * addPerson method
	 * @param person
	 */
	public void addPerson(Person person) {
		people.add(person);
	}
	
	/**
	 * removerPerson method
	 * @param person
	 */
	public boolean removePerson(Person person) {
		return people.remove(person);
	}
	
	/**
	 * countPeople method
	 * @return count val
	 */
	public int countPeople() {
		int count = people.size();
		return count;
	}
	
	/**
	 * countMales method
	 * @return count val
	 */
	public int countMales() {
		int count=0;
		// false = male
		for (Person p : people) {
			if (!p.getGender()) count++;
		}
		
		return count;
	}
	
	/**
	 * countFemales method
	 * @return count val
	 */
	public int countFemales() {
		int count=0;
		// true = female
		for (Person p : people) {
			if (p.getGender()) count++;
		}
		
		return count;
	}
	
	/**
	 * toString method
	 * @return string
	 */
	public String toString() {
		return "Total people: " + countPeople() + "\n"
				+ "Total males: " + countMales() + "\n"
				+ "Total Females: " + countFemales();
	}
	
	/**
	 * 
	 */
	public Census() {
		
	}
}
