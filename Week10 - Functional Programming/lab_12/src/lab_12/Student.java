package lab_12;
/**
 * A student class for storing overall grades.
 * 
 * @author mdixon
 */
public class Student {

	/**
	 * The student ID
	 */
	private int id;
	
	/**
	 * The student's name
	 */
	private String name;
	
	/**
	 * The students overall grade.
	 */
	private float grade;
	
	/**
	 * 
	 * @return the student ID
	 */
	public int getID() {
		
		return id;
	}
	
	/**
	 * @return the student's name
	 */
	public String getName() {
		
		return name;
	}
	
	/**
	 * 
	 * @return the students overall grade.
	 */
	public float getGrade() {
		
		return grade;
	}
	
	public String toString() {
		
		return id + " Name : '" + name + "' Grade: " + grade;
		
	}
	/**
	 * Constructor
	 * 
	 * @param id
	 * @param name
	 * @param grade
	 */
	public Student(int id, String name, float grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	
}

