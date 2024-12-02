package lab10;

public class Person {
	
	private int height, age;
	private boolean gender;
	
	/**
	 * hasCode method override
	 * allows for duplicate hashCodes from the returned val to be recognised
	 * when removing anything from an ArrayList, this is important
	 * @return integer value
	 */
	@Override
	public int hashCode() {

		if (gender)
			return height + age;
		
		return height + age * 13;
	}
	
	/**
	 * equals method override
	 * checks if the object parameter is an instance of the Person object
	 * returning boolean value allows for 
	 * @param obj
	 * @return boolean value 
	 */
	@Override
	public boolean equals(Object obj) {
		
		if ( obj instanceof Person) { // instanceof operator
			return true;
		}
		return false;
	}
	
	/**
	 * getHeight method
	 * @return
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * setHeight method
	 * @param height 
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	/**
	 * getAge method
	 * @return
	 */
	public int getAge() {
		return age;
	}
	/**
	 * setAge method
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * getGender method
	 * @return gender
	 */
	public boolean getGender() {
		return gender;
	}
	/**
	 * setGender method
	 * @param gender
	 */
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	/**
	 * toString method
	 * @return String
	 */
	public String toString() {
		String n;
		if (!getGender()) // false = male
			n = "male";
		else // true = female
			n = "female";
		
		return "Height (cm): " + getHeight() + "\n" +
				"Age (years): " + getAge() + "\n" +
				"Gender (Male / Female): " + n;
	}
	
	/**
	 * Person constructor
	 * @param height
	 * @param age
	 * @param gender
	 */
	public Person(int height, int age, boolean gender) {
		this.height = height;
		this.age = age;
		this.gender = gender;
		
		toString();
	}
}
