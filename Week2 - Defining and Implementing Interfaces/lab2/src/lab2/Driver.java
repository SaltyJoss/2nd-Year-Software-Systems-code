package lab2;

import java.util.Scanner;

public class Driver {
	/**
	 * StringBuffer method to create a nicer looking console output.
	 * 
	 * acts as a line divider that is lengthened depending on length of sentence + initial characters.
	 * 
	 * uses StringBuffer class
	 * 
	 * @param sentence
	 * @return line
	 */
	public static StringBuffer headerDivide(String sentence) {
		String divider = "=";
		char dash = '=';
		
		StringBuffer line = new StringBuffer(divider); 

		for(int i = 0; i < sentence.length() + 17; i++)
			line.append(dash);
		
		return line;
	}
	/**
	 * StringBuffer method to create a nicer looking console output.
	 * 
	 * acts as a line divider that is lengthened depending on length of sentence + initial characters.
	 * 
	 * uses StringBuffer class
	 * 
	 * @param sentence
	 * @return line
	 */
	protected static StringBuffer lineDivide(String sentence) {
		String divider = "-";
		char dash = '-';
		
		StringBuffer line = new StringBuffer(divider); 
		
		for(int i = 0; i < sentence.length() + 17; i++)
			line.append(dash);
		
		return line;
	}
	/**
	 * static void main method to drive the 'wordProcessor'
	 * 
	 * uses Scanner class to input users text, imported from java.util.
	 * 
	 * creates an object of wordProcessor
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		final String backUp = "This is my back-up sentence, assuming the manual input hasnt worked.";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Type a sentence: ");
		
		String sentence = scan.nextLine();
		scan.close();
		
		WordProcessor obj = new WordProcessor(sentence, backUp);
		
		if(sentence.length() < 1)
			sentence = obj.setBackUp(backUp);
		
		System.out.println(headerDivide(sentence) + "\n"
				+ "Chosen sentence: " + sentence 
				+ "\n" + headerDivide(sentence) + "\n"
				+ "No. of Words:\t\t" + obj.countWords(sentence) + " words.\n" 
				+ lineDivide(sentence) + "\n"
				+ "No. of Letters:\t\t" + obj.countLetters(sentence) + " letters.\n"
				+ lineDivide(sentence) + "\n"
				+ "Length of Sentence:\t" + obj.getLength(sentence) + " characters long.");
	}

}
