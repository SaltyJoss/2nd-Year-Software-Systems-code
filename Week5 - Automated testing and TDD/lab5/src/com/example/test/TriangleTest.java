package com.example.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import lab5.Triangle;

class TriangleTest {
	int n1, n2, n3;
	
	Random rndm = new Random();
	// tests the basic constructor
	@Test
	void BasicCOnstructTest() {
		
		Triangle triangle = new Triangle();
		
		assertTrue(triangle.isEquilateral());
		assertFalse(triangle.isScalene());
		assertEquals(3, triangle.getPerimeter());
	}
	
	// tests the basic constructor
	@Test
	void SecondConstructTest() {
		
		Triangle triangle = new Triangle(76);
		
		assertTrue(triangle.isEquilateral());
		assertFalse(triangle.isScalene());
		assertEquals(228, triangle.getPerimeter());
	}
	
	// tests getAverage method
	@RepeatedTest(5)
	void getAverageTest() {
		n1 = rndm.nextInt(100);
		n2 = rndm.nextInt(100);
		n3 = rndm.nextInt(100);
		
		Triangle t1 = new Triangle(n1,n2,n3);
		
		int avg = (n1+n2+n3) / 3;
		
		assertEquals(avg, t1.getAverageLength());
	}
	
	// test set sides with isType() method
	@RepeatedTest(5)
	void setSidesEquilTest() {
		Triangle t1 = new Triangle();
		
		t1.setSides(10,20,30);
		
		assertFalse(t1.isIsosceles());
		assertTrue(t1.isScalene());
	}
	
	// test set sides with isType() method
	@RepeatedTest(5)
	void setSidesIsoTest() {
		Triangle t1 = new Triangle();
		
		t1.setSides(10,20,10);
		
		assertFalse(t1.isEquilateral());
		assertTrue(t1.isIsosceles());
		
		t1.setSides(10,10,20);
		
		assertFalse(t1.isEquilateral());
		assertTrue(t1.isIsosceles());
		
		t1.setSides(20,10,10);
		
		assertFalse(t1.isEquilateral());
		assertTrue(t1.isIsosceles());
	}
	
	// test set sides with isType() method
	@RepeatedTest(5)
	void setSidesScalTest() {
		Triangle t1 = new Triangle();
		
		t1.setSides(10,20,30);
		
		assertFalse(t1.isEquilateral());
		assertTrue(t1.isScalene());
	}
	
	
	// tests the second setSides method
	@Test
	void setSidesB() {
		Triangle t1 = new Triangle();
		
		t1.setSides(100);
		
		assertTrue(t1.isEquilateral());
		assertFalse(t1.isScalene());
	}
	
	// tests the second setSides method
	@Test
	void setSidesC() {
		Triangle t1 = new Triangle();
		
		t1.setSides(43, 12);
		
		assertFalse(t1.isEquilateral());
		assertTrue(t1.isIsosceles());
	}
	
	@Test
	void testTriangleCOpy() {
		Triangle t1 = new Triangle(10,20,30);
		Triangle t2 = t1.copy();
		
		assertEquals(t1.getAverageLength(), t2.getAverageLength());
		
	}
	
	
}
