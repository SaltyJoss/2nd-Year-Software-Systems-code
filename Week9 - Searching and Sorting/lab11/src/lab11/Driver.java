package lab11;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		
		// Initializes the object
		NumberChecker nums = new NumberChecker();
		
		// creates an array
		Integer [] arr = new Integer [] {3,5,7,8,3,3,6,8,91,23,6};
		
		// sets vals of min and max to the methods within NumberChecker 
		int max = nums.findMax(arr);
		int min = nums.findMin(arr);
		
		// Prints contents of array
		System.out.println("Array: " + Arrays.toString(arr));
		
		// prints the output of max and min vals
		System.out.println("Array Max: " + max);
		System.out.println("Array min: " + min);
	}

}
