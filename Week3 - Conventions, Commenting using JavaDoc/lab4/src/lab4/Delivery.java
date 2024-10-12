package lab4;

public interface Delivery {
	/**
	 * getTutor String method 
	 * 		-> @return String value
	 * 
	 * setTutor void method 
	 * 		-> uses String tutor args
	 * 
	 * 
	 * getRoom String method 
	 * 		-> @return String value
	 * 
	 * setRoom void method 
	 * 		-> uses String room args
	 * 
	 */
	String getTutor();
	void setTutor(String tutor) throws SubjectException;
	
	String getRoom();
	void setRoom(String room) throws SubjectException;
}
