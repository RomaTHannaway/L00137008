package ie.lyit.flight;

import java.util.ArrayList;
import ie.lyit.flight.Passenger;

public class Booking {

		private Flight outbound;
		private Flight inbound;
		private ArrayList<Passenger> passengers;
		private double totalPrice;
		private static int count;
		
		public Booking() {
			outbound = new Flight();
			inbound = new Flight();
			passengers = new ArrayList<Passenger>();
			totalPrice = 0;
			count = count+1;
		}
		
		public Booking(Flight oF, Flight iF, ArrayList<Passenger> p) {
			outbound = oF;
			inbound = iF;
			passengers = p;
			totalPrice = 0;
			count = count+1;
		}
		
		public void setTotalPrice() {
			calculatePrice();
		}
		
		public void setOutbound(Flight oF) {
			outbound = oF;
		}
		
		public void setInbound(Flight iF) {
			inbound = iF;
		}
		
		public Flight getInbound() {
			return inbound;
		}
		
		public Flight getOutbound() {
			return outbound;
		}
		
		public void setPassengers(ArrayList<Passenger> p) {
			passengers = p;
		}
		
		/*public void getPassengers() {
			return passengers;
		}*/
		
		public void calculatePrice() {
			totalPrice = (outbound.getPrice() + inbound.getPrice()) * passengers.size();
		}
		
		public double getTotalPrice() {
			return totalPrice;
		}
		
		public boolean findPassenger(Passenger p) {
			if(passengers.contains(p))
				return true;
			else
				return false;
		}
		
		public String toString() {
			return "Booking [totalPrice = " + totalPrice + " , inbound = " + inbound + ", outbound = " + outbound + "]";	
		}
		
		public boolean equals(Object obj) {
			Booking bookTest;
			if(obj instanceof Booking) {
				bookTest = (Booking)obj;
				if(bookTest.getInbound() == inbound && bookTest.getOutbound() == outbound && bookTest.getTotalPrice() == totalPrice) {
					return true;
				}
			}
			else 
				return false;
			return false;
		}
		
}
