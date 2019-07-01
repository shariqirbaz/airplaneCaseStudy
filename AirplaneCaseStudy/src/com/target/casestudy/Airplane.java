package com.target.casestudy;

public class Airplane {
	
	private String description = "Plane ready to take off! ";
	private String title;
	
	public String mainMethod(Employee securityEmployee, Employee maintenanceEmployee, Employee cleaningEmployee, String title) {
		
		// Defining Airplane title.
		this.title = title;
		
		FreightSpace freightSpace = new FreightSpace();
		PassengerCompartment passengerCompartment = new PassengerCompartment();	
		PrivateCompartment privateCompartment = new PrivateCompartment();
		
		// First Worker : Security Employee performing checks.
		// Loop because of number of passenger area's.
		for(int i = 0; i < Math.random() * 10; i++) {
			passengerCompartment.passengerArea(securityEmployee);
			privateCompartment.passengerArea(securityEmployee);
		}
		privateCompartment.equipmentCompartment(securityEmployee);
		privateCompartment.cargoBay(securityEmployee);
		freightSpace.equipmentArea1(securityEmployee);
		freightSpace.equipmentArea2(securityEmployee);
		freightSpace.equipmentArea3(securityEmployee);
		System.out.println();
		
		// Second Worker : Maintenance Employee performing maintenance tasks.
		privateCompartment.cargoBay(maintenanceEmployee);
		freightSpace.equipmentArea1(maintenanceEmployee);
		freightSpace.equipmentArea2(maintenanceEmployee);
		freightSpace.equipmentArea3(maintenanceEmployee);
		privateCompartment.equipmentCompartment(maintenanceEmployee);
		System.out.println();
		
		// Third Worker : Cleaner Employee performing cleaning tasks.
		for(int i = 0; i < Math.random() * 10; i++) {
			passengerCompartment.passengerArea(cleaningEmployee);
		}
		freightSpace.equipmentArea1(cleaningEmployee);
		freightSpace.equipmentArea2(cleaningEmployee);
		freightSpace.equipmentArea3(cleaningEmployee);
		System.out.println();
		
		return title + description;
	}
	
}
