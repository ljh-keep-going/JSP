package com.service.impl;

import java.util.List;
import com.dao.EmployeeDao;
import com.dao.impl.EmployeeDaoImpl;
import com.entity.Employee;
import com.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	@Override
	public int saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.saveEmployee(employee);
	}

	@Override
	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeList();
	}

	@Override
	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.updateEmployee(employee);
	}

	@Override
	public int delEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.delEmployee(employeeId);
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeById(employeeId);
	}

}
