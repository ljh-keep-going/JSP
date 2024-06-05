package com.entity;

public class Employee {
	private Integer employeeId;//
	private String employeeName;//
	private String employeeSex;//
	private String employeeAge;
	private String employeeDept;
	private String employeepost;
	private Integer employeeTel;
	private String employeeEmail;
	//get、set方法快捷键alt+s+r;
	//构造器生成：空白处右键--Source--genXXXXConstructorXXX

	public Employee(String employeeName, String employeeSex, String employeeAge, String employeeDept,
			String employeepost, int employeeTel, String employeeEmail) {
		super();
		this.employeeName = employeeName;
		this.employeeSex = employeeSex;
		this.employeeAge = employeeAge;
		this.employeeDept = employeeDept;
		this.employeepost = employeepost;
		this.employeeTel = employeeTel;
		this.employeeEmail = employeeEmail;
	}
	
	public Employee(Integer employeeId, String employeeName, String employeeSex, String employeeAge,
			String employeeDept, String employeepost, int employeeTel, String employeeEmail) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSex = employeeSex;
		this.employeeAge = employeeAge;
		this.employeeDept = employeeDept;
		this.employeepost = employeepost;
		this.employeeTel = employeeTel;
		this.employeeEmail = employeeEmail;
	}
	
	public Employee() {
		super();
	}
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeSex() {
		return employeeSex;
	}
	public void setEmployeeSex(String employeeSex) {
		this.employeeSex = employeeSex;
	}
	public String getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(String employeeAge) {
		this.employeeAge = employeeAge;
	}
	public String getEmployeeDept() {
		return employeeDept;
	}
	public void setEmployeeDept(String employeeDept) {
		this.employeeDept = employeeDept;
	}
	public String getEmployeepost() {
		return employeepost;
	}
	public void setEmployeepost(String employeepost) {
		this.employeepost = employeepost;
	}
	public int getEmployeeTel() {
		return employeeTel;
	}
	public void setEmployeeTel(int employeeTel) {
		this.employeeTel = employeeTel;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	
	
	
	
	
//	public Employee(Integer employeeId, String employeeNumber, String employeeDept, String employeeClass,
//			String employeeName, String employeeSex, String employeeAge) {
//		super();
//		this.employeeId = employeeId;
//		this.employeeNumber = employeeNumber;
//		this.employeeDept = employeeDept;
//		this.employeeClass = employeeClass;
//		this.employeeName = employeeName;
//		this.employeeSex = employeeSex;
//		this.employeeAge = employeeAge;
//	}
//	public Employee(String employeeNumber, String employeeDept, String employeeClass, String employeeName,
//			String employeeSex, String employeeAge) {
//		super();
//		this.employeeNumber = employeeNumber;
//		this.employeeDept = employeeDept;
//		this.employeeClass = employeeClass;
//		this.employeeName = employeeName;
//		this.employeeSex = employeeSex;
//		this.employeeAge = employeeAge;
//	}
//	public Employee() {
//		super();
//	}
//	public Integer getEmployeeId() {
//		return employeeId;
//	}
//	public void setEmployeeId(Integer employeeId) {
//		this.employeeId = employeeId;
//	}
//	public String getEmployeeNumber() {
//		return employeeNumber;
//	}
//	public void setEmployeeNumber(String employeeNumber) {
//		this.employeeNumber = employeeNumber;
//	}
//	public String getEmployeeDept() {
//		return employeeDept;
//	}
//	public void setEmployeeDept(String employeeDept) {
//		this.employeeDept = employeeDept;
//	}
//	public String getEmployeeClass() {
//		return employeeClass;
//	}
//	public void setEmployeeClass(String employeeClass) {
//		this.employeeClass = employeeClass;
//	}
//	public String getEmployeeName() {
//		return employeeName;
//	}
//	public void setEmployeeName(String employeeName) {
//		this.employeeName = employeeName;
//	}
//	public String getEmployeeSex() {
//		return employeeSex;
//	}
//	public void setEmployeeSex(String employeeSex) {
//		this.employeeSex = employeeSex;
//	}
//	public String getEmployeeAge() {
//		return employeeAge;
//	}
//	public void setEmployeeAge(String employeeAge) {
//		this.employeeAge = employeeAge;
//	}
	
	
	
}
