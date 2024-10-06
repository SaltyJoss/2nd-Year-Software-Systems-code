import java.text.DecimalFormat;

public class Circle extends Shape {
	/**
	 * variables and functions
	 */
	private int diameter;
	DecimalFormat decimalFormat = new DecimalFormat("#.###");
	
	/**
	 * getDiam to get the diameter.
	 * 
	 * @return diameter
	 */
	public int getDiam() {
		return diameter;
	}
	/**
	 * setDiameter method to the set the diameter of the circle.
	 * 
	 * @param diameter
	 */
	public void setDiam(int diameter) {
		this.diameter = diameter;
	}
	/**
	 * getRad method to the get the radius using diameter
	 * 
	 * @param diameter
	 * @return radius
	 */
	public double getRad(int diameter) {
		double radius = diameter / 2;
		return radius;
	}
	
	/**
	 * getArea method to get the area of a circle
	 * 
	 * @param radius used for math
	 * @return area
	 */
	public double getArea(double radius) {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	 /**
	  * toString method to convert integer-based value to a readable string
	  * 
	  * Using decimal format to make it 3dp.
	  */
	public String toString() {
		double radius = getRad(diameter);
		String area = decimalFormat.format(getArea(radius));
		return "Area: " + area + "cm^2";
	}
	/**
	 * Circle constructor, uses diameter input to solve radius, then area.
	 * 
	 * @param diameter
	 */
	Circle(int diameter) {
		super(1);
		this.diameter = diameter;
	}
	
}
