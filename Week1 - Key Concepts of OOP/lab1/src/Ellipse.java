import java.text.DecimalFormat;

public class Ellipse extends Rectangle {
	/**
	 * Variable and function list
	 */
	private int  height, length;
	DecimalFormat format = new DecimalFormat("#.###");
	/**
	 * getArea that utilises the height and length
	 * 
	 * @return area
	 */
	public double getArea(int height, int length) {
		double area = Math.PI * (height * length);
		return area;
	}
	/**
	 * toString method converting area to a 3dp string
	 * 
	 * Utlisation of decimal format, and rectangles height
	 */
	public String toString() {
		String area = decimalFormat.format(getArea(height, length));
		return "Area: " + area + "cm^2";
	}
	/**
	 * Constructor that supers Rectangles' height and length
	 * 
	 * Since we extend Rectangle, we can use their method freely
	 * 
	 * @param height
	 * @param length
	 */
	
	Ellipse(int height, int length){
		super(height, length);
		this.height = height;
		this.length = length;
		getHeight();
		getLength();
		setHeight(height);
		setLength(length);
	}
}
