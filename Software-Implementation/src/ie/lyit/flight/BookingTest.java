package ie.lyit.flight;

import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BookingTest {

	private Booking rH;
	private Flight fli1;
	private Flight fli2;
	private Passenger pass1;
	private Passenger pass2;
	ArrayList<Passenger> passengers;
	
	@Before
	public void setUp() throws Exception {
		rH = new Booking();
		
		fli1 = new Flight("BR215", "Derry", "Stanstead", 25, 12, 2018, 12, 40, 16.99);
		fli2 = new Flight("BR418", "Stanstead", "Derry", 30, 12, 2018, 10, 15, 24.99);
		
		pass1 = new Passenger("Ms", "Lisa", "Simpson", 20, 12, 1992, 1, true);
		pass2 = new Passenger("Mr", "Bart", "Simpson", 20, 12, 1992, 1, true);
		passengers = new ArrayList<Passenger>();
	}

	@Test
	public void testToString() {
		passengers.add(pass1);
		rH.setInbound(fli1);
		rH.setOutbound(fli2);
		assertTrue(rH.toString().contains(fli1.toString()));
		assertTrue(rH.toString().contains(fli2.toString()));
	}

	@Test
	public void testSetTotalPrice() {
		return totalPrice;
	}
	
	@Test
	public void testSetPassengers() {
		passengers.add(pass1);
		rH.setPassengers(passengers);
		assertEquals("Passengers Size: ", rH.getPassengers().size(),1,0);
	}
	
	@Test
	public void testBookingFlightFlightArrayListOfPassenger() {
		
	}
	
	@Test
	public void testInbound() {
		rH.setInbound(fli2);
		assertEquals(rH.getInbound(), fli2);
	}
	
	@Test
	public void testOutbound() {
		rH.setOutbound(fli1);
		assertEquals(rH.getOutbound(), fli1);
	}
	
	@Test
	public void testFindPassenger() {
		assertNotSame(pass1, pass2);
		assertSame(pass1, pass2);
	}
}
