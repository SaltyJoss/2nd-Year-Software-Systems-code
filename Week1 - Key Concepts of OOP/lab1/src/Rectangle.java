import java.text.DecimalFormat;

class Rectangle extends Shape {
	
	/**
	 * Variable and functions.
	 */
	private int height, length;
	DecimalFormat decimalFormat = new DecimalFormat("#.###");
	
	/**
	 * Gets the height of the shape (Rectangle)
	 */
	public int getHeight() {
		return height;
	}
	public int getLength() {
		return length;
	}
	/**
	 * Sets the height of the shape (Rectangle)
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * Sets the length of the shape (Rectangle)
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
	/**
	 * Gets area of shape (Rectangle)
	 * 
	 * @param height
	 * @param length
	 */
	public double getArea(int height, int length) {
		int area = (height * length) / 2;
		return area;
	}
	/**
	 * To string output for debugging
	 */
	public String toString() {
		return "Area: " + getArea(height, length) + "cm^2";
	}
	
	Rectangle(int height, int length){
		super(4);
		this.height = height;
		this.length = length;
	}
}
