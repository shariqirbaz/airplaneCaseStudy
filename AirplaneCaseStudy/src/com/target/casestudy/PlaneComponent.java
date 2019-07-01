package com.target.casestudy;

public class PlaneComponent {

	private String description;
	
	// Method for ready check.
	public void readyCheck(Employee employee, String description) {
		this.description = description;
		System.out.println(employee.getName() + " : " + description);
	}
	
}
