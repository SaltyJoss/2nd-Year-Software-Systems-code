package lab_12;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(1, "JJ. Jognson", 38));
		students.add(new Student(2, "P. Tibbs", 48));
		students.add(new Student(3, "W. Major", 28));
		students.add(new Student(4, "P. Turner", 60));
		students.add(new Student(5, "A. Ball", 20));
		students.add(new Student(6, "B. Smithy", 90));
		students.add(new Student(7, "R. Jules", 71));
		students.add(new Student(8, "T. Verne", 97));

		
		// QUESTION 1
		System.out.println("QUESTION 1\n===========\n");
		
		// Part 1 - Student Info
		System.out.println("Part 1.1:\n---------");
		students.stream().forEach(System.out::println);
		System.out.println("");
		
		// Part 2 - Students grade above 70
		System.out.println("Part 1.2:\n---------");
		students.stream().filter(s -> s.getGrade() > 70).forEach(System.out::println);
		
		System.out.println("");
		
		// Part 3 - Students names in an array as Upper-case, and Alphabetised 
		System.out.println("Part 1.3:\n---------");
		Object [] studentArray = students.stream()
				.map(s -> s.getName().toUpperCase())
				.sorted()
				.toArray();
		
		System.out.println(Arrays.toString(studentArray) + "\n");
		
		// Part 4 - Students overall average grade
		System.out.println("Part 1.4:\n---------");
		double aveGrade = students.stream()
				.mapToDouble(s -> s.getGrade())
				.average()
				.getAsDouble();
		
		System.out.println("Overall average grade: " + aveGrade + "\n\n");
		
		
		// QUESTION 2
		System.out.println("QUESTION 2\n===========\n");
		
		// Part 1 - Numbers in range of 90->100
		System.out.println("Part 2.1:\n---------");
		IntStream.range(90, 101).forEach(System.out::println);
		
		System.out.println("");
				
		// Part 2 - List of random numbers in a range between 0->5, displayed as a stream
		System.out.println("Part 2.2:\n---------");
		List<Integer> numList = Stream.generate(Math::random)
				.map(n -> (int)(n*5+1))
				.limit(10)
				.collect(Collectors.toList());
		
		for(int n : numList)
			System.out.println("Next random value is: " + n);
		
		System.out.println("");
				
		// Part 3 - Updated list from Part 2, but doesn't repeat the same number
		System.out.println("Part 2.3:\n---------");
		List<Integer> numListBetter = Stream.generate(Math::random)
				.map(n -> (int)(n*5+1))
				.limit(10)
				.distinct()
				.collect(Collectors.toList());
		
		for(int n : numListBetter)
			System.out.println("Next random value is: " + n);
		
		System.out.println("");
		
		System.exit(0);
				
	}
}
