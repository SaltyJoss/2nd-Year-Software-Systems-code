package lab10;

public class Driver {

	public static void main(String[] args) {
		
		// Census instance
		Census log = new Census();
		 
		// add a collection of people
		log.addPerson(new Person(183, 21, false));
		log.addPerson(new Person(150, 22, true));
		log.addPerson(new Person(180, 26, false));
		log.addPerson(new Person(178, 19, true));
		log.addPerson(new Person(166, 23, false));
		log.addPerson(new Person(170, 24, true));
		
		// print
		System.out.println(log);
		
		System.out.println("\n");
		
		// remove people (one non person)
		log.removePerson(new Person(183, 21, false));
		log.removePerson(new Person(180, 26, false));
		log.removePerson(new Person(154, 29, false));
		
		// print
		System.out.println(log);
		
	}

}
