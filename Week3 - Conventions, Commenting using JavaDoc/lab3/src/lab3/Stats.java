package lab3;
import java.util.Arrays;


public class Stats {
	
	private int[] numberArr;
	private int count;
	
	/**
	 * addValue method
	 * 
	 * a void method to set the Array to value
	 * 
	 * count + 1 for everytime value is added
	 * 
	 * @param value
	 */
	public void addValue(int value) {
		numberArr[count] = value;
		count++;
	}
	/**
	 * getCounter method
	 * 
	 * @return array length
	 */
	public int getCounter() {
		return numberArr.length;
	}
	/**
	 * getMax method
	 * 
	 * @return the max value 
	 */
	public int getMax() {
	
		int max = numberArr[0];	
	
		for (int i = 1; i < numberArr.length; i++) { // find the numbers in the array using .length, starting i at 1
			if (numberArr[i] > max)	// if the number of i is bigger than int min
				max = numberArr[i];	// max = the number
		}
			
		return max;
	}
	/**
	 * getMin method
	 * 
	 * @return min number
	 */
	public int getMin() {
		
	int min = numberArr[0]; 
	
	for (int i = 1; i < numberArr.length; i++) { // find the numbers in the array using .length, starting i at 1
	
		if (numberArr[i] < min) // if the number of i is smaller than int min
				min = numberArr[i]; // min = the number
		}
	
		return min;
	}
	/**
	 * getTotal method
	 * 
	 * @return total amount of numbers
	 */
	public int getTotal() {
			
		int total = 0;
			
		for (int i = 0; i < numberArr.length; i++) { // find the numbers in the array using .length
			total += numberArr[i]; // adds i (the numbers) to total, until loop is closed
		}
		
		return total;
	}
	/**
	 * getAverage method
	 * 
	 * gets the average of the number Array
	 * 
	 * @return Avg
	 */ 
	public double getAverage() {
			
		int val = 0;
		for (int i = 0; i < numberArr.length; i++) { // loop that checks for length of numbers in array
			val += numberArr[i]; // changes the local method integer val to equal the number up until the length is reached
		}
			
		double Avg = val/(double)numberArr.length; // calculates the average of the Array
			
		return Avg;
	}
	/**
	 * toString method
	 * 
	 * @return the numbers array converted to a String
	 */
	@Override
	public String toString() {
		return Arrays.toString(numberArr);
	}
		
	/**
	 * Constructor for Stats
	 * 
	 * relates numbers to a new integer array (capacity)
	 * 
	 * @param capacity
	 */
	public Stats(int capacity) {
		numberArr = new int[capacity];
	}
	
}
