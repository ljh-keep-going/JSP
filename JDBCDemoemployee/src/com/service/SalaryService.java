package com.service;

import java.util.List;
import com.entity.Salary;

public interface SalaryService {
	int saveSalary(Salary salary);//新增
	List<Salary> getSalaryList();
	int updateSalary(Salary salary);//修改
	int delSalary(int employeeNo);//删除
	Salary getSalaryById(int employeeNo);//查询单个
}
