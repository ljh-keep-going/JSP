package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.dao.SalaryDao;
import com.entity.Salary;
import com.util.DBHelper;

public class SalaryDaoImpl implements SalaryDao {
	private DBHelper dbHelper=DBHelper.getInstance();
	//新增
	public int saveSalary(Salary salary) {
		String sql = "INSERT INTO `salary` (`employeeName`,`employeeId`,`salaryMonth`,`basicSalary`,`overtimePay`,`bonus`,`finalSalary`)\r\n"+ 
	              "VALUES(?,?,?,?,?,?,?)";
		return dbHelper.executeUpdateForPreparedStatement(sql, 
				salary.getEmployeeName(),salary.getEmployeeId(),
				salary.getSalaryMonth(),salary.getBasicSalary(),
				salary.getOvertimePay(),salary.getBonus(),salary.getFinalSalary());
	}
	//查询
	public List<Salary> getSalaryList() {
		List<Salary> salarys = new ArrayList<Salary>();
		String sql = "SELECT `employeeNo`,`employeeName`,`employeeId`,`salaryMonth`,`basicSalary`,`overtimePay`,`bonus`,`finalSalary`\r\n" + 
				"FROM `salary`";
		try {
			ResultSet rs=dbHelper.executeQueryForPreparedStatement(sql, null);
			Salary salary = null;
			while(rs.next()) {
				salary = new Salary();
				salary.setEmployeeNo(rs.getInt("employeeNo"));// rs.getXXX("数据库中表的列名")
				salary.setEmployeeName(rs.getString("employeeName"));
				salary.setEmployeeId(rs.getInt("employeeId"));
				salary.setSalaryMonth(rs.getString("salaryMonth"));
				salary.setBasicSalary(rs.getInt("basicSalary"));
				salary.setOvertimePay(rs.getInt("overtimePay"));
				salary.setBonus(rs.getInt("bonus"));
				salary.setFinalSalary(rs.getInt("finalSalary"));
				salarys.add(salary);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return salarys;
	}
	//修改
	public int updateSalary(Salary salary) {
		String sql="update salary set employeeName=?,employeeId=?,salaryMonth=?,basicSalary=?,overtimePay=?,bonus=?,finalSalary=? where employeeNo=?";
		return dbHelper.executeUpdateForPreparedStatement(sql, 
				salary.getEmployeeName(),salary.getEmployeeId(),
				salary.getSalaryMonth(),salary.getBasicSalary(),
				salary.getOvertimePay(),salary.getBonus(),
				salary.getFinalSalary(),salary.getEmployeeNo());
	}
	//删除
	public int delSalary(int employeeNo) {
		String sql="delete from salary where employeeNo=?";
		return dbHelper.executeUpdateForPreparedStatement(sql, employeeNo);
	}
	//查询单个：通过id获取单个年级对象
	public Salary getSalaryById(int employeeNo) {
		String sql = "SELECT `employeeNo`,`employeeName`,`employeeId`,`salaryMonth`,`basicSalary`,`overtimePay`,`bonus`,`finalSalary`\r\n" + 
				"FROM `salary` where employeeNo=?";
		Salary salary = null;		
		try {
			ResultSet rs=dbHelper.executeQueryForPreparedStatement(sql, employeeNo);
			while(rs.next()) {
				salary = new Salary();
				salary.setEmployeeNo(rs.getInt("employeeNo"));// rs.getXXX("数据库中表的列名")
				salary.setEmployeeName(rs.getString("employeeName"));
				salary.setEmployeeId(rs.getInt("employeeId"));
				salary.setSalaryMonth(rs.getString("salaryMonth"));
				salary.setBasicSalary(rs.getInt("basicSalary"));
				salary.setOvertimePay(rs.getInt("overtimePay"));
				salary.setBonus(rs.getInt("bonus"));
				salary.setFinalSalary(rs.getInt("finalSalary"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			dbHelper.closeAllObject();
		}
		return salary;
	}
}
