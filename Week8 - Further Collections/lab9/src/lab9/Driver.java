package lab9;

public class Driver {

	public static void main(String[] args) {
		
		WordCounter wc = new WordCounter();
		
		wc.addSentence("This sentence has the word has in it twice");
		
		wc.outputResults();

	}

}
