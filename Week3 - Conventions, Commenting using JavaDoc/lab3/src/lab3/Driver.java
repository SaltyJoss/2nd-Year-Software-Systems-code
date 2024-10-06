package lab3;
import java.util.Random;


public class Driver {
	private static String headerDivide() {
		return "=========================================================";
	}
	private static String lineDivide() {
		return "---------------------------------------------------------";
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		final int arrayLength = 10; // non-changing integer value accessible by all classes
		
		Stats stats = new Stats(arrayLength); // initialies the object with the integer value arrayLength

		Random random = new Random();
		
		for (int i = 0; i < arrayLength; i++) { 
			stats.addValue(random.nextInt(100)); // chooses a random number between 0, 99 until VALUE amount reached
		}
		/**
		 * Output providing inital numbers in array (0,9) stored
		 * 
		 * Shows the Count, Min, Max, Average, then total, following some normal sequential order
		 * 
		 * uses \t to make everything tidy and visible
		 * 
		 * headerDivide(), lineDivide() methods used locally to make everything readable
		 */
		System.out.println("Numbers stored : " + stats + "\n"
		 + headerDivide() + "\n"
		 + "Count \t\t = \t\t" + stats.getCounter() + "\n"
		 + lineDivide() + "\n"
		 + "Minimum value \t = \t\t" + stats.getMin() + "\n"
		 + lineDivide() + "\n"
		 + "Maximum value \t = \t\t" + stats.getMax() + "\n"
		 + lineDivide() + "\n"
		 + "Average \t = \t\t" + stats.getAverage() + "\n"
		 + lineDivide() + "\n"
		 + "Total \t\t = \t\t" + stats.getTotal());
	}
}