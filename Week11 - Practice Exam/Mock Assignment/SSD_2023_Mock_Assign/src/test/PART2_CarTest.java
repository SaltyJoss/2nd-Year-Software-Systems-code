package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import vehicles.Car;

/**
 * Tests the {@link Car} class.
 * 
 * NOTE: DO NOT CHANGE THE CONTENTS OF THIS FILE.
 * 
 * @author mdixon
 */
class PART2_CarTest {

	@Test
	void testCarWheels() {

		Car c1 = new Car("", "");
		assertEquals(4, c1.getWheels(), "Car (c1) wheel count should be set to 4");

		Car c2 = new Car("Ford", "FT23 9XY");
		assertEquals(4, c2.getWheels(), "Car (c2) wheel count should be set to 4");
	}

	@Test
	void testCarModel() {

		Car c1 = new Car("Ford", "");
		assertTrue("Ford".equals(c1.getModel()), "The model name of Car (c1) should be \"Ford\"");

		Car c2 = new Car("BMW", "");
		assertTrue("BMW".equals(c2.getModel()), "The model name of Car (c2) should be \"BMW\"");
	}

	@Test
	void testCarRegistration() {

		Car c1 =  new Car("", "FG64 12Y");
		assertTrue("FG64 12Y".equals(c1.getRegistration()), "The reg of Car (c1)  should be \"FG64 12Y\"");

		Car c2 =  new Car("", "FG64 16X");
		assertTrue("FG64 16X".equals(c2.getRegistration()), "The reg of Car (c2)  should be \"FG64 16X\"");
	}

	@Test
	void testCarDefaultTankSize() {

		Car c1 =  new Car("", "FG64 12Y");
		assertEquals(0, c1.getTankSize(), "The default tank size of Car (c1) should be 0");
	}

	@Test
	void testCarDefaultRange() {

		Car c1 =  new Car("", "FG64 12Y");
		assertEquals(100, c1.getMaxRange(), "The default max range of Car (c1) should be 100");
	}

	@Test
	void testTrainSetTankSize() {

		Car c1 =  new Car("", "");

		c1.setTankSize(52);
		assertEquals(52, c1.getTankSize(), "The tank size of Car (c1) should be 52");

		c1.setTankSize(42);
		assertEquals(42, c1.getTankSize(), "The tank size of Car (c1) should be 42");
	}

	@Test
	void testCarSetRange() {

		Car c1 =  new Car("", "");

		c1.setRange(48);
		assertEquals(48, c1.getRange(), "The range of car (c1) should be 48");

		c1.setRange(32);
		assertEquals(32, c1.getRange(), "The range of car (c1) should be 32");
	}
	
	@Test
	void testCarIsElectric() {

		Car c1 =  new Car("", "");

		assertTrue(c1.isElectric(), "The car (c1) should be electric by default");

		c1.setTankSize(52);
		assertFalse(c1.isElectric(), "The car (c1) should not be electric with a tank size set to more than 0");
	}
	
	@Test
	void testCarGetMaxRange() {

		Car c1 =  new Car("", "");

		assertEquals(100, c1.getMaxRange(), "The default max range of car (c1) should be 100");

		c1.setRange(200);
		assertEquals(200, c1.getMaxRange(), "The max range of electric car (c1) should be 200");
		
		c1.setTankSize(10);
		assertEquals(2000, c1.getMaxRange(), "The max range of non-electric car (c1) should be 2000");
		
		c1.setTankSize(11);
		assertEquals(2200, c1.getMaxRange(), "The max range of non-electric car (c1) should be 2200");
	}
	
	@Test
	void testCarAll() {

		Car c1 = new Car("Audi", "YF65 TWA");
		assertEquals(0, c1.getTankSize(), "The tank size of Car (c1) should be 0");
		assertEquals(100, c1.getRange(), "The range of Car (c1) should be 100");
		assertTrue(c1.isElectric(), "The car (c1) should be electric by default");
		
		assertEquals(4, c1.getWheels(), "Car (c1) wheel count should be set to 4");
		assertTrue("Audi".equals(c1.getModel()), "The model name of Car (c1) should be \"Audi\"");
		assertTrue("YF65 TWA".equals(c1.getRegistration()), "The reg of Car (c1) should be \"YF65 TWA\"");
		
		c1.setRange(200);
		assertEquals(200, c1.getRange(), "The range of Car (c1) should be 200");
		assertEquals(200, c1.getMaxRange(), "The max range of Car (c1) should be 200");
		
		c1.setRange(10);
		c1.setTankSize(10);
		assertEquals(10, c1.getRange(), "The range of Car (c1) should be 10");
		
		assertEquals(100, c1.getMaxRange(), "The max range of Car (c1) should be 100");
		assertEquals(10, c1.getTankSize(), "The tank size of Car (c1) should be 10");
		
		assertFalse(c1.isElectric(), "The car (c1) should be not be electric once tank size is not 0");
	}

}
