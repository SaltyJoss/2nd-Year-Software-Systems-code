package lab4;

import java.util.Arrays;

public abstract class Subject implements Delivery{
	public String tutor, room, name;
	public int credit;
	
	public static String[] tutorList = {"B.Johnson", "J.J.Jamerson", "T.Johnson", "Dr.Octavious", "Dr.M.Binding",
			"Mary Jane", "Ms.Adams"};
	public static String[] roomList = {"101", "102", "104", "106", "103", "108", "110"};
	
	/**
	 * method to get the tutor name
	 * 
	 * @return tutor String
	 */
	@Override
	public String getTutor() {
		return tutor;
	}
	/**
	 * method to set the the tutor string
	 * 
	 * uses the String args, which is called upon after input from the driver class
	 * @throws NoTutorException 
	 */
	@Override
	public void setTutor(String tutor) throws SubjectException {
		
		if (Arrays.asList(tutorList).contains(tutor) == false || tutor == null) {
			throw new NoTutorException("Invalid Argument: " + tutor);
		}
		else {
			this.tutor = tutor;
		}
		
		
	}
	/**
	 * method to get the Room no.
	 * 
	 * @return room String
	 */
	@Override
	public String getRoom() {
		return room;
	}
	/**
	 * method to set the the room no.
	 * 
	 * uses the String args, which is called upon after input from the driver class
	 */
	@Override
	public void setRoom(String room) throws SubjectException {
		
		if (Arrays.asList(roomList).contains(room) == false || room == null) {
			throw new NoRoomException("Invalid Argument: " + room);
		}
		
		this.room = room;
	}
	/**
	 * method to get the subname
	 * 
	 * @return subName String
	 */
	public String getName() {
		return name;
	}
	/**
	 * Method to add more or less "\t" or tabs to a string depending on the length of string argument
	 * 
	 * @param subName
	 * @return "\t" tab format based on length of subject Name
	 */
	protected static String tabInsert(String name) {
		String tab = "\t┼\t";
		
		if (name.length() < 8) {
			tab = "\t\t┼\t";
		}
		
		return tab;
	}
	/**
	 * toString method (named 'classSLot'
	 * 
	 * assembles the arguments into one line that can be output
	 * 
	 * tabInsert(String args) utilizes the method to create appropriate space
	 * 
	 * @return
	 */
	public String classSlot() {
		return "\t├\t" + name + tabInsert(name) + credit + "\t┼\t" + tutor + "\t┼\t" + room + "\t┤\n";
	}
	/**
	 * abstract method defined, other sub-classes can use this as they please
	 */
	public abstract int getCredit();
}
