package com.employee;

public class Employee {

	private String E_id;
	private String EmpName;
	private String Email;
	
	
	public Employee() {}
	
	public Employee(String e_id, String empName, String email) {
		super();
		E_id = e_id;
		EmpName = empName;
		Email = email;
	}
	public String getE_id() {
		return E_id;
	}
	public void setE_id(String e_id) {
		E_id = e_id;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
}
