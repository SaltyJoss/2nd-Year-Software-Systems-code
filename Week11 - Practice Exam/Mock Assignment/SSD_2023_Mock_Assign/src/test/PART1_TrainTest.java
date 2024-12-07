package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import vehicles.Train;

/**
 * Tests the {@link Train} class.
 * 
 * NOTE: DO NOT CHANGE THE CONTENTS OF THIS FILE.
 * 
 * @author mdixon
 */
class PART1_TrainTest {

	@Test
	void testTrainWheels() {

		Train t1 = new Train(100, "", "");
		assertEquals(100, t1.getWheels(), "Train (t1) wheel count should be set to 100");

		Train t2 = new Train(200, "", "");
		assertEquals(200, t2.getWheels(), "Train (t2) wheel count should be set to 200");
	}

	@Test
	void testTrainModel() {

		Train t1 = new Train(10, "High Speed Train", "");
		assertTrue("High Speed Train".equals(t1.getModel()), "The model name of Train (t1) should be \"High Speed Train\"");

		Train t2 = new Train(10, "Cross Country", "");
		assertTrue("Cross Country".equals(t2.getModel()), "The model name of Train (t2) should be \"Cross Country\"");
	}

	@Test
	void testTrainRegistration() {

		Train t1 = new Train(10, "", "123-A");
		assertTrue("123-A".equals(t1.getRegistration()), "The reg of Train (t1) should be \"123-A\"");

		Train t2 = new Train(10, "", "X-10");
		assertTrue("X-10".equals(t2.getRegistration()), "The reg of Train (t2) should be \"X-10\"");
	}

	@Test
	void testTrainDefaultPassengers() {

		Train t1 = new Train(10, "", "");
		assertEquals(125, t1.getPassengerCount(), "The default passenger count of Train (t1) should be 125");
	}

	@Test
	void testTrainDefaultRange() {

		Train t1 = new Train(10, "", "");
		assertEquals(200, t1.getMaxRange(), "The default max range of Train (t1) should be 200");
	}

	@Test
	void testTrainSetPassengerCount() {

		Train t1 = new Train(10, "", "");

		t1.setPassengerCount(55);
		assertEquals(55, t1.getPassengerCount(), "The passenger count of Train (t1) should be 55");

		t1.setPassengerCount(20);
		assertEquals(20, t1.getPassengerCount(), "The passenger count of Train (t1) should be 20");
	}

	@Test
	void testTrainSetMaxRange() {

		Train t1 = new Train(10, "", "");

		t1.setMaxRange(133);
		assertEquals(133, t1.getMaxRange(), "The max range of Train (t1) should be 133");

		t1.setMaxRange(233);
		assertEquals(233, t1.getMaxRange(), "The max range of Train (t1) should be 233");
	}

	@Test
	void testTrainGetTrainLen() {

		Train t1 = new Train(10, "", "");

		assertEquals(32, t1.getTrainLength(), "The length of Train (t1) should be 32");

		Train t2 = new Train(100, "", "");
		assertEquals(320, t2.getTrainLength(), "The length of Train (t1) should be 320");
	}
	
	@Test
	void testTrainZeroTrainLen() {

		Train t1 = new Train(0, "", "");

		assertEquals(0, t1.getTrainLength(), "The length of Train (t1) should be 0");
	}
	
	@Test
	void testTrainAll() {

		Train t1 = new Train(50, "Basic Train", "XYZ-123");

		assertEquals(50, t1.getWheels(), "Train (t1) wheel count should be set to 50");
		assertEquals(160, t1.getTrainLength(), "The length of Train (t1) should be 160");
		assertEquals(200, t1.getMaxRange(), "The default max range of Train (t1) should be 200");
		assertEquals(125, t1.getPassengerCount(), "The default passenger count of Train (t1) should be 125");
		assertTrue("Basic Train".equals(t1.getModel()), "The model name of Train (t1) should be \"Basic Train\"");
		assertTrue("XYZ-123".equals(t1.getRegistration()), "The reg of Train (t1) should be \"XYZ-123\"");
		
		t1.setMaxRange(100);
		assertEquals(100, t1.getMaxRange(), "The max range of Train (t1) should be 100");
		
		t1.setPassengerCount(15);
		assertEquals(15, t1.getPassengerCount(), "The passenger count of Train (t1) should be 15");
	}

}
