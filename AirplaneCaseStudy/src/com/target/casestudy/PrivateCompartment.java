package com.target.casestudy;

public class PrivateCompartment extends PlaneComponent{
	
	PlaneComponent planeComponent = new PlaneComponent();
	
	private String equipmentCompartment = "Equipment Compartment OK!";
	private String cargoBay = "Cargo Bay OK!";
	private String privateDescription = "Private Compartment OK!";
	
	public void passengerArea(Employee employee) {
		planeComponent.readyCheck(employee, privateDescription);
	}
	
	public void equipmentCompartment(Employee employee) {
		System.out.println(employee.getName() + " : " + equipmentCompartment);
	}
	
	public void cargoBay(Employee employee) {
		System.out.println(employee.getName() + " : " + cargoBay);
	}
	
}
