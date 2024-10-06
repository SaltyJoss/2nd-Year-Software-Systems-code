package lab2;

public interface Counter {
	/**
	 * setBackUp -> sets the backup sentence
	 * 
	 * countWords -> counts the words in the String 'sentence'.
	 * 
	 * countLetters -> counts the letters in the String 'sentence'.
	 * 
	 * getLength -> gets the length of the String 'sentence'.
	 */
	String setBackUp(String backUp);
	int countWords(String sentence);
	int countLetters(String sentence);
	int getLength(String sentence);
}
