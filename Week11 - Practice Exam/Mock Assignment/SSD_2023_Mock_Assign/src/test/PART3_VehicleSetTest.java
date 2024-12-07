package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import vehicles.Car;
import vehicles.Train;
import vehicles.Vehicle;
import vehicles.VehicleSet;

/**
 * Tests the {@link VehicleSet} class.
 * 
 * 
 * NOTE: DO NOT CHANGE THE CONTENTS OF THIS FILE.
 * 
 * @author mdixon
 */
class PART3_VehicleSetTest {

	/**
	 * The {@link VehicleSet} instance created prior to each test.
	 */
	private VehicleSet vehicles;

	@BeforeEach
	void setUpBeforeEach() throws Exception {

		vehicles = new VehicleSet();
	}

	@Test
	void testVehicleSetCount() {

		assertEquals(0, vehicles.vehicleCount(), "VehicleSet should be empty when first created, VehicleSet.vehicleCount() not working correctly?");
	}

	@Test
	void testVehicleSetAdd() {

		Vehicle v1 = new Train(20, "High Speed", "XAS-123");

		assertEquals(1, vehicles.addVehicle(new Car("Ford", "TF21 7TY")), "VehicleSet.addVehicle() not working correctly? Not returning total count");
		assertEquals(2, vehicles.addVehicle(new Car("Mini", "TX22 7RP")), "VehicleSet.addVehicle() not working correctly? Not returning total count");

		// check 2 vehicles reported
		assertEquals(2, vehicles.vehicleCount(), "VehicleSet.vehicleCount() not working correctly?");

		// add a third vehicles
		assertEquals(3, vehicles.addVehicle(new Train(20, "Low Speed", "AAS-982")), "VehicleSet.addVehicle() not working correctly? Not returning total count");
		assertEquals(3, vehicles.vehicleCount(), "VehicleSet.vehicleCount() not working correctly?");

		// add same vehicle more than once, should not be added multiple times, since a Set (not a List)
		assertEquals(4, vehicles.addVehicle(v1));
		assertEquals(4, vehicles.addVehicle(v1));
		assertEquals(4, vehicles.addVehicle(v1));
		assertEquals(4, vehicles.vehicleCount(), "VehicleSet.vehicleCount() not working correctly?");
	}

	@Test
	void testVehicleSetRemove() {

		Vehicle v1 = new Train(20, "High Speed", "XAS-123");
		Vehicle v2 = new Train(20, "Low Speed", "AAS-982");

		assertEquals(1, vehicles.addVehicle(v1), "VehicleSet.addVehicle() not working correctly? Not returning total count");
		assertEquals(1, vehicles.vehicleCount(), "VehicleSet.vehicleCount() not working correctly?");

		assertTrue(vehicles.removeVehicle(v1), "VehicleSet.removeVehicle() not working correctly?, Should return true if removed");
		assertEquals(0, vehicles.vehicleCount(), "VehicleSet.vehicleCount() not working correctly? Vehicle not actually removed?");

		assertEquals(1, vehicles.addVehicle(new Car("Ford", "TF21 7TY")), "VehicleSet.addVehicle() not working correctly?");
		assertEquals(2, vehicles.addVehicle(new Train(20, "C-Country", "999-25TY")), "VehicleSet.addVehicle() not working correctly?");
		assertEquals(3, vehicles.addVehicle(v1), "VehicleSet.addVehicle() not working correctly?");
		assertEquals(4, vehicles.addVehicle(new Car("Mini", "TX22 7RP")), "VehicleSet.addVehicle() not working correctly?");
		assertEquals(4, vehicles.vehicleCount(), "VehicleSet.vehicleCount() not working correctly?");

		// try to remove vehicle not yet added.
		assertFalse(vehicles.removeVehicle(v2), "VehicleSet.removeVehicle() not working correctly?, Should return false if vehicle not present");
		assertEquals(4, vehicles.vehicleCount(), "VehicleSet.removeVehicle() not working correctly? Vehicle actually removed?");

		// now remove v1 again
		assertTrue(vehicles.removeVehicle(v1), "VehicleSet.removeVehicle() not working correctly?, Should return true if vehicle removed");
		assertEquals(3, vehicles.vehicleCount(), "VehicleSet.removeVehicle() not working correctly? Vehicle not actually removed?");

		// try to remove v1 again, even though just removed
		assertFalse(vehicles.removeVehicle(v1), "VehicleSet.removeVehicle() not working correctly?, Should return false if vehicle not present");
		assertEquals(3, vehicles.vehicleCount(), "VehicleSet.removeVehicle() not working correctly? Vehicle removed twice?");
	}

	@Test
	void testVehicleSetContains() {

		Vehicle v1 = new Train(20, "High Speed", "XAS-123");
		Vehicle v2 = new Train(20, "Low Speed", "AAS-982");

		assertFalse(vehicles.containsVehicle(v1), "VehicleSet.containsVehicle() not working correctly?, Should return false if vehicle not present");
		assertFalse(vehicles.containsVehicle(v2), "VehicleSet.containsVehicle() not working correctly?, Should return false if vehicle not present");

		assertEquals(1, vehicles.addVehicle(v2), "VehicleSet.addVehicle() not working correctly? Not returning total vehicles count");
		assertTrue(vehicles.containsVehicle(v2), "VehicleSet.containsVehicle() not working correctly?, Should return true if vehicle present");
		assertFalse(vehicles.containsVehicle(v1), "VehicleSet.containsVehicle() not working correctly?, Should return false if vehicle not present");
		assertEquals(1, vehicles.vehicleCount(), "VehicleSet.vehicleCount() not working correctly?");

		assertEquals(2, vehicles.addVehicle(v1));
		assertTrue(vehicles.containsVehicle(v1), "VehicleSet.containsVehicle() not working correctly?, Should return true if vehicle present");
	}

	@Test
	void testVehicleSetClear() {

		assertEquals(1, vehicles.addVehicle(new Train(20, "High Speed", "XAS-123")), "VehicleSet.addVehicle() not working correctly? Not returning total vehicles count");
		assertEquals(2, vehicles.addVehicle(new Train(20, "Low Speed", "AAS-123")), "VehicleSet.addVehicle() not working correctly? Not returning total vehicles count");
		assertEquals(3, vehicles.addVehicle(new Car("Ford", "TF21 7TY")), "VehicleSet.addVehicle() not working correctly? Not returning total vehicles count");
		assertEquals(4, vehicles.addVehicle(new Car("BMW", "TT21 8GY")), "VehicleSet.addVehicle() not working correctly? Not returning total vehicles count");

		assertEquals(4, vehicles.vehicleCount(), "VehicleSet.vehicleCount() not working correctly?");

		vehicles.clearAllVehicles();
		assertEquals(0, vehicles.vehicleCount(), "VehicleSet.clearAllVehicles() not working correctly? List should be empty");
	}

	@Test
	void testVehicleSetGetLargestRange() {

		Train r1 = new Train(10, "", "");
		r1.setMaxRange(10);

		Train r2 = new Train(10, "", "");
		r2.setMaxRange(1000);

		Train r3 = new Train(10, "", "");
		r3.setMaxRange(500);

		assertNull(vehicles.getLargestRange(), "VehicleSet.getLargestRange() should return null when the collection is empty");

		assertEquals(1, vehicles.addVehicle(r1), "VehicleSet.addVehicle() not working correctly?");
		assertEquals(2, vehicles.addVehicle(r2), "VehicleSet.addVehicle() not working correctly?");
		assertEquals(3, vehicles.addVehicle(r3), "VehicleSet.addVehicle() not working correctly?");

		assertSame(r2, vehicles.getLargestRange(), "VehicleSet.getLargestRange() not working correctly?");

		Train r4 = new Train(10, "", "");

		// add vehicle before it is set to the largest
		assertEquals(4, vehicles.addVehicle(r4));

		assertSame(r2, vehicles.getLargestRange(), "VehicleSet.getLargestRange() not working correctly? Not checking updated range?");

		// update r4 to be the largest range
		r4.setMaxRange(5000);
		assertSame(r4, vehicles.getLargestRange(), "VehicleSet.getLargestRange() not working correctly? Not checking updated range?");
	}

	@Test
	void testVehicleSetCountVehiclesOfModel() {

		assertEquals(0, vehicles.countVehiclesOfModel("BMW"), "VehicleSet.countVehiclesOfModel() not working?");

		assertEquals(1, vehicles.addVehicle(new Car("BMW", "")), "VehicleSet.addVehicle() not working correctly?");
		assertEquals(2, vehicles.addVehicle(new Car("Ford", "")), "VehicleSet.addVehicle() not working correctly?");
		assertEquals(3, vehicles.addVehicle(new Car("Mini", "")), "VehicleSet.addVehicle() not working correctly?");
		assertEquals(4, vehicles.addVehicle(new Car("BMW", "")), "VehicleSet.addVehicle() not working correctly?");
		assertEquals(2, vehicles.countVehiclesOfModel("BMW"), "VehicleSet.countVehiclesOfModel() not working?");

		assertEquals(5, vehicles.addVehicle(new Car("Ford", "")), "VehicleSet.addVehicle() not working correctly?");
		assertEquals(2, vehicles.countVehiclesOfModel("BMW"), "VehicleSet.countVehiclesOfModel() not working?");

		assertEquals(6, vehicles.addVehicle(new Car("BMW", "")), "VehicleSet.addVehicle() not working correctly?");
		assertEquals(3, vehicles.countVehiclesOfModel("BMW"), "VehicleSet.countVehiclesOfModel() not working?");
		assertEquals(2, vehicles.countVehiclesOfModel("Ford"), "VehicleSet.countVehiclesOfModel() not working?");
		assertEquals(1, vehicles.countVehiclesOfModel("Mini"), "VehicleSet.countVehiclesOfModel() not working?");
		assertEquals(0, vehicles.countVehiclesOfModel("Audi"), "VehicleSet.countVehiclesOfModel() not working?");
	}

	@Test
	void testVehicleSetCountVehiclesOfModelAdvanced() {

		try {
			assertEquals(0, vehicles.countVehiclesOfModel(null), "VehicleSet.countVehiclesOfModel() not working?");
			assertEquals(0, vehicles.countVehiclesOfModel(""), "VehicleSet.countVehiclesOfModel() not working?");

			assertEquals(0, vehicles.countVehiclesOfModel("BMW"), "VehicleSet.countVehiclesOfModel() not working?");
			assertEquals(1, vehicles.addVehicle(new Car("FORD", "")), "VehicleSet.addVehicle() not working correctly?");
			assertEquals(2, vehicles.addVehicle(new Car("BMW", "")), "VehicleSet.addVehicle() not working correctly?");
			assertEquals(3, vehicles.addVehicle(new Car("AUDI", "")), "VehicleSet.addVehicle() not working correctly?");

			assertEquals(1, vehicles.countVehiclesOfModel("bMw"), "VehicleSet.countVehiclesOfModel() not working with mixed case?");
			assertEquals(1, vehicles.countVehiclesOfModel("ford"), "VehicleSet.countVehiclesOfModel() not working with mixed case?");
			assertEquals(1, vehicles.countVehiclesOfModel("Audi"), "VehicleSet.countVehiclesOfModel() not working with mixed case?");

			assertEquals(4, vehicles.addVehicle(new Car("bmw", "")), "VehicleSet.addVehicle() not working correctly?");
			assertEquals(2, vehicles.countVehiclesOfModel("BmW"), "VehicleSet.countVehiclesOfModel() not working with mixed case?");

		} catch (Exception e) {

			fail("VehicleSet.countVehiclesOfModel() throwing an exception when null model value passed, should return 0");
		}
	}

	@Test
	void testVehicleContainsVehicleWithReg() {

		assertFalse(vehicles.containsVehicleWithReg("LS12 2PF"), "VehicleSet.containsVehicleWithReg() should return false when collection empty");

		assertEquals(1, vehicles.addVehicle(new Car("BMW", "LS22 2PE")), "VehicleSet.addVehicle() not working correctly?");
		assertEquals(2, vehicles.addVehicle(new Car("FORD", "PO26 7TY")), "VehicleSet.addVehicle() not working correctly?");

		assertFalse(vehicles.containsVehicleWithReg("LS12 2PF"), "VehicleSet.containsVehicleWithReg() should return false when no matching vehicle");

		assertEquals(3, vehicles.addVehicle(new Car("BMW", "LS12 2PF")), "VehicleSet.addVehicle() not working correctly?");
		assertEquals(4, vehicles.addVehicle(new Car("AUDI", "HG67 2YT")), "VehicleSet.addVehicle() not working correctly?");

		assertTrue(vehicles.containsVehicleWithReg("LS12 2PF"), "VehicleSet.containsVehicleWithReg() should return true when matching vehicle present");
		assertTrue(vehicles.containsVehicleWithReg("HG67 2YT"), "VehicleSet.containsVehicleWithReg() should return true when matching vehicle present");
	}

	@Test
	void testVehicleContainsVehicleWithRegAdvanced() {

		try {
			assertFalse(vehicles.containsVehicleWithReg(null), "VehicleSet.containsVehicleWithReg() no working?");
			assertFalse(vehicles.containsVehicleWithReg(""), "VehicleSet.containsVehicleWithReg() no working?");
			
			assertEquals(1, vehicles.addVehicle(new Car("BMW", "LS22 2PE")), "VehicleSet.addVehicle() not working correctly?");
			assertEquals(2, vehicles.addVehicle(new Car("FORD", "PO26 7TY")), "VehicleSet.addVehicle() not working correctly?");

			assertFalse(vehicles.containsVehicleWithReg(null), "VehicleSet.containsVehicleWithReg() no working?");
			
			assertFalse(vehicles.containsVehicleWithReg("LS12 2PF"), "VehicleSet.containsVehicleWithReg() should return false when no matching vehicle");

			assertFalse(vehicles.containsVehicleWithReg("pO26 7TY"), "VehicleSet.containsVehicleWithReg() should return false if case different");
			assertTrue(vehicles.containsVehicleWithReg("PO26 7TY"), "VehicleSet.containsVehicleWithReg() should return true if case matches");

		} catch (Exception e) {

			fail("VehicleSet.containsVehicleWithReg() throwing an exception when null registration value passed, should return 0");
		}
	}
}
