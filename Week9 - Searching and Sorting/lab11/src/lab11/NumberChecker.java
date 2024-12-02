package lab11;

import java.util.Arrays;

public class NumberChecker {
	
	/**
	 * findMax Method
	 * @param numbers
	 * @return
	 */
	public int findMax(Integer [] numbers) {
		int max = numbers[0];
		
		for (int i=1; i < numbers.length; i++)
			if (numbers[i] > max)
				max = numbers[i];
		
		return max;
	}
	
	/**
	 * findMin method
	 * @param numbers
	 * @return
	 */
	public int findMin(Integer [] numbers) {
		Arrays.sort(numbers);
		
		return numbers[0];
	}
	
	/*
	 * empty constructor for initialisation
	 */
	public NumberChecker() {
		
	}
}
