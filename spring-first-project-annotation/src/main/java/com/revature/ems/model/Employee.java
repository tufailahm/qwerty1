package com.revature.ems.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

		private int employeeId;
		private String employeeName;
		private String employeeAddress;
		private int salary;
		
		//dependent object - has a composition
		
		//autowireby type
		@Autowired(required = false)
		@Qualifier("email2")
		private Email email;
		
		@Autowired
		private ContactDetails contactDetails;
		
		public Employee() {
			System.out.println("Employee default constructor called");
		}
		//we want spring to treat rev1 as an init method for this employee
		//init method
		@PostConstruct
		public void rev1() {
			System.out.println("Rev1 called");
			employeeName="Jayesh";
		}
		
		//destroy method
		@PreDestroy
		public void doneWithApp() {
			System.out.println("doneWithApp called");
			employeeName=null;
		}
		public Employee(int employeeId, String employeeName, String employeeAddress, int salary, Email email,
				ContactDetails contactDetails) {
			System.out.println("employee six cons called");
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.employeeAddress = employeeAddress;
			this.salary = salary;
			this.email = email;
			this.contactDetails = contactDetails;
		}

		public ContactDetails getContactDetails() {
			return contactDetails;
		}

		public void setContactDetails(ContactDetails contactDetails) {
			this.contactDetails = contactDetails;
		}

		public Employee(int employeeId, String employeeName, String employeeAddress, int salary) {
			System.out.println("Employee 4 parameter constructor called");

			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.employeeAddress = employeeAddress;
			this.salary = salary;
		}

		
		public Employee(int employeeId, String employeeName, String employeeAddress, int salary, Email email) {
			System.out.println("5 param cons called");
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.employeeAddress = employeeAddress;
			this.salary = salary;
			this.email = email;
		}

		public Email getEmail() {
			return email;
		}

		public void setEmail(Email email) {
			this.email = email;
		}

		public Employee(int employeeId, String employeeName) {
			System.out.println("emp id and name cons called");
			this.employeeId = employeeId;
			this.employeeName = employeeName;
		}

		public int getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(int employeeId) {
			System.out.println("Employee setEmployeeId() called");

			this.employeeId = employeeId;
		}

		public String getEmployeeName() {
			return employeeName;
		}

		public void setEmployeeName(String employeeName) {
			System.out.println("Employee setEmployeeName() called");

			this.employeeName = employeeName;
		}

		public String getEmployeeAddress() {
			return employeeAddress;
		}

		public void setEmployeeAddress(String employeeAddress) {
			System.out.println("Employee setEmployeeAddress() called");
			this.employeeAddress = employeeAddress;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			System.out.println("Employee setSalary() called");

			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
					+ employeeAddress + ", salary=" + salary + ", email=" + email + ", contactDetails=" + contactDetails
					+ "]";
		}
		
		
}
