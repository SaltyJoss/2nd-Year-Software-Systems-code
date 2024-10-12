package exe_lab;

public class ArrayProcessor {
	
	/**
	 * method to get the array length of an objectArray
	 * 
	 * @param a
	 * @return
	 * @throws Exception
	 */
	public int getArrayLength(Object[] a) throws Exception {
		
		int count = 0;
		
		/**
		 * Try and catch block to return an error if count failed
		 * 
		 */
		try { // try and catch to check for errors
			for (int i = 0; a.length > i; i++) { // for loop to go through the length and add to i until length reached
				++count;
			}
		}
		catch(Exception e) {
			if(count > 0) {
				System.out.println("ERROR: Count failed at: " + count);
			}
			else {
				System.out.println("ERROR: Major fail, count not intialised");
			}
		}
		
		return count;
	}
	
	/*
	 * empty constructor to initialize in Driver
	 */
	public ArrayProcessor() {
	}
}
