package lab4;

public class Driver {

	public static void main(String[] args) {
		Subject [] subjectArray = new Subject[7];
		
		Math m1 = new Math();
		m1.setSubName("Math");
		m1.setTutor("B.Johnson");
		m1.setRoom("101");
		
		subjectArray[0] = m1;
		
		Physics p1 = new Physics();
		p1.setSubName("Physics");
		p1.setTutor("J.J.Jamerson");
		p1.setRoom("102");
		
		subjectArray[1] = p1;
		
		Chemistry c1 = new Chemistry();
		c1.setSubName("Chemistry");
		c1.setTutor("B.Johnson");
		c1.setRoom("102");
		
		subjectArray[2] = c1;
		
		Geography g1 = new Geography();
		g1.setSubName("Geography");
		g1.setTutor("Dr.Octavious");
		g1.setRoom("106");
		
		subjectArray[3] = g1;
		
		History h1 = new History();
		h1.setSubName("History");
		h1.setTutor("Dr.M.Binding");
		h1.setRoom("101");
		
		subjectArray[4] = h1;
		
		Languages l1 = new Languages();
		l1.setSubName("Language");
		l1.setTutor("Mary Jane");
		l1.setRoom("098");
		
		subjectArray[5] = l1;
		
		Art a1 = new Art();
		a1.setSubName("Art");
		a1.setTutor("Ms.Adams");
		a1.setRoom("110");
		
		subjectArray[6] = l1;
		
		System.out.println("___________________________________________\n"
						 + "| SUBJECT | No.CREDITS |   TUTOR   | ROOM |\n"
						 + "|=-------=|=----------=|=---------=|=----=|\n"
						 + m1.toString()
						 + "|---------|------------|-----------|------|\n"
						 + p1.toString()
						 + "|---------|------------|-----------|------|\n"
						 + c1.toString()
						 + "|---------|------------|-----------|------|\n"
						 + g1.toString()
						 + "|---------|------------|-----------|------|\n"
						 + h1.toString()
						 + "|---------|------------|-----------|------|\n"
						 + l1.toString()
						 + "|---------|------------|-----------|------|\n"
						 + a1.toString()
						 + "|_________|____________|___________|______|\n");
	}

}
