package lab7;

import java.util.Stack;

public class NumberSorter {
	
	/**
	 * Public method isSorted that checks if initial array is sorted
	 * @param n -> integer array
	 * @param a -> boolean
	 * @return a
	 */
	public boolean isSorted(int[] n, boolean a) {
		
		// set default val of bool as true
		
		// for loop that iterates through the length (-1) of the array
		for (int i=0; i > n.length - 1; i++) {
			if (n[i] > n[i + 1]) {
				a = false; // if any index in the array is more than the one before it, not sorted
			} else {
				System.out.println("\tStack is sorted");
				a = true;
			}
		}
		return a; // return bool
	}
	
	/*
	 * public method that sorts an array of numbers
	 */
	public void sort(int [] numbers,  boolean ascending) {
		// source stack, from which numbers are popped
		Stack<Integer> srcStack = new Stack<Integer>();
		
		// destination stack, to which numbers are pushed
		Stack<Integer> destStack = new Stack<Integer>();
		
		// initial array of numbers to source stack
		for (int number : numbers)
			srcStack.push(number);
		
		// calling isSorted() method to check if initial array is sorted
		ascending = isSorted(numbers, ascending);
		
		//System.out.println("\tis the initial array sorted? " + ascending);
		//System.out.println("\t" + srcStack);
		
		while (!ascending == true) {
			// while loop that runs as long as stack size is more than 0
			while (srcStack.size() > 0) {
				
				// signed integer next, to the value of the stack pop 
				int next = srcStack.pop();
				
				// while loop to run as long as dest size is more than 0 AND the stack peek is more than next
				while (destStack.size() > 0 && destStack.peek() > next) {
					srcStack.push(destStack.pop());
				}
				
				// once loop is broken OR done it pushes next integer to the top of the stack
				destStack.push(next);
			}
			
			ascending = true;
		}
		
		// while loop that runs whilst stack ISNT empty
		while (!destStack.isEmpty())
			System.out.println("\t[" + destStack.pop() + "]" + "->");
		
		System.out.println("\nStack End");
	}
	
	/*
	 * Empty constructor
	 */
	public NumberSorter() {
		
	}
}
