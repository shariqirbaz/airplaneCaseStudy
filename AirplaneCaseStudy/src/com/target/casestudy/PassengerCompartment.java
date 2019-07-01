package com.target.casestudy;

public class PassengerCompartment extends PlaneComponent{
	
	PlaneComponent planeComponent = new PlaneComponent();
	String passengerDescription = "Passenger Compartment OK!";
	
	public void passengerArea(Employee employee) {
		planeComponent.readyCheck(employee, passengerDescription);
	}

	
	
}
