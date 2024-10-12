package lab4;

import java.util.Arrays;

public class Driver {
	
	public static void main(String[] args) throws SubjectException{
		
		String formatString; // variable for later use
		
		Subject [] subjectArray = new Subject[7];
		try {
			Math m1 = new Math(); // Object for Math class, m1
			m1.setTutor("B.Johnson");
			m1.setRoom("101");
			
			subjectArray[0] = m1; // addition of m1 to subjectArray
			
			Physics p1 = new Physics(); // Object for Physics class, p1
			p1.setTutor("J.J.Jamerson");
			p1.setRoom("102");
			
			subjectArray[1] = p1; // addition of p1 to subjectArray
			
			Chemistry c1 = new Chemistry(); // Object for Chemistry class, c1
			c1.setTutor("T.Johnson");
			c1.setRoom("104");
			
			subjectArray[2] = c1; // addition of c1 to subjectArray
			
			Geography g1 = new Geography(); // Object for Geography class, g1
			g1.setTutor("Dr.Octavious");
			g1.setRoom("106");
			
			subjectArray[3] = g1; // addition of g1 to subjectArray
			
			History h1 = new History(); // Object for History class, h1
			h1.setTutor("Dr.M.Binding");
			h1.setRoom("103");
			
			subjectArray[4] = h1; // addition of h1 to subjectArray
			
			Languages l1 = new Languages(); // Object for Languages class, l1
			l1.setTutor("Mary Jane");
			l1.setRoom("108");
			
			subjectArray[5] = l1; // addition of l1 to subjectArray
			
			Art a1 = new Art(); // Object for Art class, a1
			a1.setTutor("Ms.Adams");
			a1.setRoom("110");
			
			subjectArray[6] = a1; // addition of a1 to subjectArray	
			
			/**]
			 * Changes the subjectArray to a string, contents of the .toString(ArrArgs) sent to 'formatString' variabl
			 *
			 * Multiple .replace(char, new-char) to replace the visible square-brackets and commas to nothing.
			 * 
			 * .trim() 
			 */
			formatString = Arrays.toString(subjectArray) //Changes the subjectArray to a string, contents of the .toString(ArrArgs)
					.replace("[", "") // .replace(char, new-char) to replace the visible square-brackets
					.replace(",", "") // .replace(char, new-char) to replace the visible commas
					.replace("]", "")
					.trim(); // .trim() to trim the whitespace of now replace areas.
			
			
			System.out.println("\t┌-----------------------┬---------------┬-----------------------┬---------------┐\n"
							 + "\t|        SUBJECT        |   No.CREDITS  |         TUTOR         |      ROOM     |\n"
							 + "\t├=---------------------=┼=-------------=┼=---------------------=┼=-------------=┤\n"
							 + "\t" + formatString + "\n"
							 + "\t└-----------------------┴---------------┴-----------------------┴---------------┘\n");
		}
		catch(SubjectException e) {
			System.out.println("ERROR: Something went wrong.");
		}
		
		System.exit(0); // System.exit(0) to close the application once it has output, easy way not waste RAM whilst debugging
	}

}
