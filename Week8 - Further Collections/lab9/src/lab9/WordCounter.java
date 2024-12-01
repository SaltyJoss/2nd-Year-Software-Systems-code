package lab9;

import java.util.*;

public class WordCounter {
	
	/**
	 * Maps words to their occurrence count
	 */
	private final Map<String, Integer> wordMap = new HashMap<String, Integer>();
	
	/**
	 * addWord method, checks if wordMap already contains the key, if false puts key into map with set value
	 * @param word
	 */
	private void addWord(String word) {
		
		int count = 1;
		
		// if statement to check if map contains key or not
		if (wordMap.containsKey(word)) {
			wordMap.put(word, count++); // puts key - word - into map with set value - count + 1 - so it can show amount of item
		} else {
			wordMap.put(word, count); // if no more than one, just sets count to default
		}
	}
	
	/**
	 * addSentence method, takes a sentence, splits it up by spaces, adds to map (by calling previous method)
	 * @param sentence
	 */
	public void addSentence(String sentence) {
		
		String[] words = sentence.split(" ");
		
		for (String word : words)
			addWord(word);
	}
	
	/**
	 * outputResults method, output the results of the map
	 */
	public void outputResults() {
		
		for (String word : wordMap.keySet())
			System.out.println(word + " : " + wordMap.get(word));
	}
}
