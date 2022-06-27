package org.employee;

import org.client.ClientDetails;
//            class
public class EmployeeDetails {
	
	// method 1
	private void empName() {
		System.out.println("Employee name: Anand");
	}
	// method 2
	private void empMobile() {
		System.out.println("Employee Mobile: 8939278836");
	}
	// method 3
	private void empAdd() {
		System.out.println("Employee add: OMR-chennai");
	}
	
	private void empClient() {
		System.out.println("Tech mahindra");
	}
	//               main method
	public static void main(String[] args) {
		
		ClientDetails cl = new ClientDetails();
		cl.clName();
		cl.clLocation();
		
		// object / obj creation
		EmployeeDetails e = new EmployeeDetails();
		
		// method call
		e.empName();
		e.empMobile();
		e.empAdd();
		
		Company com = new Company();
		com.comName();
		com.comId();
	}

}
