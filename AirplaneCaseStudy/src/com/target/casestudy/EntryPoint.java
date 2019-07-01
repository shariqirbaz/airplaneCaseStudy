package com.target.casestudy;

public class EntryPoint {
	
	public static void main(String[] args) {
		
		String description;
		
		// Creating Objects of Airplane Class to refer different planes.
		Airplane firstPlane = new Airplane();
		Airplane secondPlane = new Airplane();

		// Creating Objects of Employee Class to refer different workers.
		Employee securityEmployee = new Employee("Security Employee");
		Employee maintenanceEmployee = new Employee("Maintenance Employee");
		Employee cleaningEmployee = new Employee("Cleaning Employee");

		// First Plane is getting assigned to different workers.
		description = firstPlane.mainMethod(securityEmployee, maintenanceEmployee, cleaningEmployee, "First");
		System.out.println(description + "\n" + "==================================================================");
		
		// Second Plane is getting assigned to different workers.
		description = secondPlane.mainMethod(securityEmployee, maintenanceEmployee, cleaningEmployee, "Second");
		System.out.println(description);
	}

}
