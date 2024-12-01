package lab5;
/**
 * A Triangle with three integer lengths
 *
 * @author mdixon
 */
public class Triangle {
	private int sideA, sideB, sideC; // Length of side A, B and C

	/**
	 * An Isosceles triangle is a triangle which has two equal length sides.
	 *
	 * @return true if the triangle is isosceles
	 */
	public boolean isIsosceles() {
		return (sideA == sideB && sideA != sideC) || (sideB == sideC && sideB != sideA)
				|| (sideC == sideA && sideC != sideB);
	}

	/**
	 * An Equilateral triangle is a triangle which has three equal length sides.
	 *
	 * @return true if the triangle is equilateral
	 */
	public boolean isEquilateral() {
		return (sideA == sideB && sideA == sideC);
	}

	/**
	 * A scalene triangle is a triangle in which all three sides are in different
	 * lengths.
	 *
	 * @return true if the triangle is scalene
	 */
	public boolean isScalene() {
		return (sideA != sideB && sideA != sideC && sideB != sideC);
	}

	/**
	 * Sets each side of the triangle to a given value.
	 *
	 * @param a length of side A
	 * @param b length of side B
	 * @param c length of side C
	 */
	public void setSides(int a, int b, int c) {
		sideA = Math.abs(a);
		sideB = Math.abs(b);
		sideC = Math.abs(c);
	}

	/**
	 * Sets the triangle to be equilateral with all sides set to the given length
	 *
	 * @param length the length of side A, B and C
	 */
	public void setSides(int length) {
		sideA = sideB = sideC = Math.abs(length);
	}

	/**
	 * Sets the triangle to be scalene with two sides set to the same value.
	 *
	 * @param length the length of side A, B
	 * @param other  the length of side C
	 */
	public void setSides(int length, int other) {
		sideA = sideB = Math.abs(length);
		sideC = Math.abs(other);
	}

	/**
	 * Creates and returns a copy of the triangle. Changing the side lengths of the
	 * copy will not effect the original triangle.
	 *
	 * @return a copy of the Triangle
	 */
	public Triangle copy() {
		return new Triangle(sideA, sideB, sideC);
	}

	/**
	 * Calculates the total length of all the sides.
	 *
	 * @return the total length of all the sides.
	 */
	public int getPerimeter() {
		return sideA + sideB + sideB;
	}

	/**
	 * Calculates the average length of the sides.
	 *
	 * @return the average length of the sides as an integer
	 */
	public int getAverageLength() {
		return (sideA + sideB + sideC) / 3;
	}

/////////////////////////////////////////////////////
	/**
	 * Constructor
	 *
	 * Creates a triangle with each side set to a given value.
	 *
	 * @param a length of side A
	 * @param b length of side B
	 * @param c length of side C
	 */
	public Triangle(int a, int b, int c) {
		sideA = Math.abs(a);
		sideB = Math.abs(b);
		sideC = Math.abs(c);
	}

	/**
	 * Constructor
	 *
	 * Creates an equilateral triangle with all sides set to the given length
	 *
	 * @param length the length of side A, B and C
	 */
	public Triangle(int length) {
		sideA = sideB = sideC = Math.abs(length);
	}

	/**
	 * Constructor
	 *
	 * Creates an equilateral triangle with all sides set to 1
	 */
	public Triangle() {
		sideA = sideB = sideC = 1;
	}
}
