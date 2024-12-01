package lab7;

public class Driver {

	public static void main(String[] args) {
		NumberSorter sorter = new NumberSorter();
		
		System.out.println("Stack 1 Start: \n");
		sorter.sort(new int [] {1,9,2,3,19,8,24,1,99,101,0,34,12,3}, false);
		
		System.out.println("\nStack 2 Start: \n");
		sorter.sort(new int [] {23,67,3,2,7,4,89,23,769,19,43,2,4}, false);
		
		System.out.println("\nStack 3 Start: \n");
		sorter.sort(new int [] {6,7,9,0,3,2,1,66,5,4,33,23,78,99,8}, false);
		
		System.out.println("\nStack 4 Start: \n");
		sorter.sort(new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, false);
		
		System.out.println("\nStack 5 Start: \n");
		sorter.sort(new int [] {50,51,52,53,54,55,56,57,58,59,60,61,62,63}, true);
	}

}
