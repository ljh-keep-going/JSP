package com.entity;

public class Salary {
	private Integer employeeNo;
	private String employeeName;
	private Integer employeeId; 
	private String salaryMonth;
	private Integer basicSalary;
	private Integer overtimePay;
	private Integer bonus;
	private Integer finalSalary;

    public Salary() {
	    super();
    }
    
    public Salary(String employeeName, Integer employeeId, String salaryMonth, Integer basicSalary, Integer overtimePay, Integer bonus, Integer finalSalary) {
	    super();
	    this.employeeName = employeeName;
	    this.employeeId = employeeId;
	    this.salaryMonth = salaryMonth;
	    this.basicSalary = basicSalary;
	    this.overtimePay = overtimePay;
	    this.bonus = bonus;
	    this.finalSalary = finalSalary;
    }
    
    public Salary(Integer employeeNo, String employeeName, Integer employeeId, String salaryMonth, Integer basicSalary, Integer overtimePay, Integer bonus, Integer finalSalary) {
	    super();
	    this.employeeNo = employeeNo;
	    this.employeeName = employeeName;
	    this.employeeId = employeeId;
	    this.salaryMonth = salaryMonth;
	    this.basicSalary = basicSalary;
	    this.overtimePay = overtimePay;
	    this.bonus = bonus;
	    this.finalSalary = finalSalary;
    }

	public Integer getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(Integer employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getSalaryMonth() {
		return salaryMonth;
	}

	public void setSalaryMonth(String salaryMonth) {
		this.salaryMonth = salaryMonth;
	}

	public Integer getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(Integer basicSalary) {
		this.basicSalary = basicSalary;
	}

	public Integer getOvertimePay() {
		return overtimePay;
	}

	public void setOvertimePay(Integer overtimePay) {
		this.overtimePay = overtimePay;
	}

	public Integer getBonus() {
		return bonus;
	}

	public void setBonus(Integer bonus) {
		this.bonus = bonus;
	}

	public Integer getFinalSalary() {
		return finalSalary;
	}

	public void setFinalSalary(Integer finalSalary) {
		this.finalSalary = finalSalary;
	}
	
}