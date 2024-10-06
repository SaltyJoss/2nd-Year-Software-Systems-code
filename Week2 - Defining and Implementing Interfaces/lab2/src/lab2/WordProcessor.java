package lab2;
/**
 * Class 'WordProcessor' that implements interface 'Counter'
 */
public class WordProcessor implements Counter{
	/**
	 * protected String 'sentence', accessed by sub-class 'BackUpSentence'
	 */
	private String sentence;
	private String backUp;
	/**
	 * getBackUp() -> gets the sentence for backup
	 * @param backUp 
	 * 
	 * @return nothing because method return type is void.
	 */
	private void getBackUp(String backUp) {
		this.backUp = backUp;
	}
	/**
	 * setBackUp(String) -> sets the backup sentence using the getBackUp method to define the String
	 * 
	 * declare that sentence equals backUp.
	 * 
	 *@return sentence 
	 */
	public String setBackUp(String backUp) {
		getBackUp(backUp);
		return backUp;
	}
	/**
	 * int method 'countWords' counts the words in a sentence -> minusing the white-space
	 * 
	 * uses the split function to seperate each word into an array
	 * 
	 * for loop to the get the length of array (index going upwards of 0), for each word -> 'words' get binary addition (1)
	 * 
	 * @return words.
	 */
	public int countWords(String sentence) {
		int words = 0;
		
		String[] wordList = sentence.split(" ");
		for(int i = 0; i < wordList.length; i++)
			words++;
		return words;
	}
	/**
	 * int method 'countLetters' for counting the letters in a sentence
	 * 
	 * uses for loop to find the length whilst adding to index (i)
	 * 
	 * 'Character.isLetter(char Val)' allows for a checker within if statment for if a character is also a letter.
	 * 
	 * @return letters.
	 */
	public int countLetters(String sentence) {
		int letters = 0;
		
		for(int i = 0; i < sentence.length(); i++)
			if(Character.isLetter(sentence.charAt(i)))
				letters++;
		
		return letters;
	}
	/**
	 * int method 'getLength' gets the length of the sentence
	 * 
	 * uses same for loop as 'countLetters', which just counts every character.
	 * 
	 * for loop adds to length for every char
	 * 
	 * @return length.
	 */
	public int getLength(String sentence) {
		int length = 0;
		
		for(int i = 0; i < sentence.length(); i++)
			length++;
		
		return length;
	}
	/**
	 * toString method to output all the method internally
	 * 
	 * all method called with sentence
	 * 
	 * @return the final outcome
	 */
	@Override
	public String toString() {
		return sentence;
	}
	
	WordProcessor(String sentence, String backUp){
		this.backUp = backUp;
		this.sentence = sentence;
	}
}
