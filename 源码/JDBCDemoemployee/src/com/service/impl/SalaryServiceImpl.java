package com.service.impl;

import java.util.List;
import com.dao.SalaryDao;
import com.dao.impl.SalaryDaoImpl;
import com.entity.Salary;
import com.service.SalaryService;

public class SalaryServiceImpl implements SalaryService{
	private SalaryDao salaryDao=new SalaryDaoImpl();
	@Override
	public int saveSalary(Salary salary) {
		return salaryDao.saveSalary(salary);
	}

	@Override
	public List<Salary> getSalaryList() {
		return salaryDao.getSalaryList();
	}

	@Override
	public int updateSalary(Salary salary) {
		return salaryDao.updateSalary(salary);
	}

	@Override
	public int delSalary(int employeeNo) {
		return salaryDao.delSalary(employeeNo);
	}

	@Override
	public Salary getSalaryById(int employeeNo) {
		return salaryDao.getSalaryById(employeeNo);
	}

}
