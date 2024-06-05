package com.dao.impl;
/**
 * 操作具体表的增删改查
 * @author Administrator
 *
 */

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.EmployeeDao;
import com.entity.Employee;
import com.entity.Salary;
import com.util.DBHelper;

public class EmployeeDaoImpl implements EmployeeDao{
	private DBHelper dbHelper=DBHelper.getInstance();
	//新增
	public int saveEmployee(Employee employee) {
		String sql = "INSERT INTO `employee`(`employeeName`,`employeeSex`,`employeeAge`,`employeeDept`,`employeepost`,`employeeTel`,`employeeEmail`)\r\n" + 
				"VALUES(?,?,?,?,?,?,?)";
		return dbHelper.executeUpdateForPreparedStatement(sql, 
				employee.getEmployeeName(),employee.getEmployeeSex(),employee.getEmployeeAge(),
				employee.getEmployeeDept(),employee.getEmployeepost(),
				employee.getEmployeeTel(),employee.getEmployeeEmail());
	}
	//查询
	public List<Employee> getEmployeeList(){
		List<Employee> employees = new ArrayList<Employee>();
		String sql = "SELECT `employeeId`,`employeeName`,`employeeSex`,`employeeAge`,`employeeDept`,`employeepost`,`employeeTel`,`employeeEmail`\r\n "+
				"FROM `employee`";
		try {
			ResultSet rs=dbHelper.executeQueryForPreparedStatement(sql, null);
			Employee employee=null;
			while(rs.next()) {
				employee=new Employee();
				employee.setEmployeeId(rs.getInt("employeeId"));//rs.getXXX("列名")
				employee.setEmployeeName(rs.getString("employeeName"));
				employee.setEmployeeSex(rs.getString("employeeSex"));
				employee.setEmployeeAge(rs.getString("employeeAge"));
				employee.setEmployeeDept(rs.getString("employeeDept"));
				employee.setEmployeepost(rs.getString("employeepost"));
				employee.setEmployeeTel(rs.getInt("employeeTel"));
				employee.setEmployeeEmail(rs.getString("employeeEmail"));
				
				employees.add(employee);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employees;
	}
	//修改
		@Override
		public int updateEmployee(Employee employee) {
			String sql="update employee set employeeName=?,employeeSex=?,employeeAge=?,employeeDept=?,employeepost=?,employeeTel=?,employeeEmail=? where employeeId=?";
			return dbHelper.executeUpdateForPreparedStatement(sql, 
					employee.getEmployeeName(),employee.getEmployeeSex(),employee.getEmployeeAge(),
					employee.getEmployeeDept(),employee.getEmployeepost(),
					employee.getEmployeeTel(),employee.getEmployeeEmail(),employee.getEmployeeId());
		}
		//删除
		@Override
		public int delEmployee(int employeeId) {
			String sql="delete from employee where employeeId=?";
			return dbHelper.executeUpdateForPreparedStatement(sql, employeeId);
		}
		//查询单个：通过id获取单个对象
		@Override
		public Employee getEmployeeById(int employeeId) {
			String sql = "SELECT `employeeId`,`employeeName`,`employeeSex`,`employeeAge`,`employeeDept`,`employeepost`,`employeeTel`,`employeeEmail`\r\n" + 
					"FROM `employee` where employeeId=?";
			Employee employee=null;	
			try {
				ResultSet rs=dbHelper.executeQueryForPreparedStatement(sql, employeeId);
				while(rs.next()) {
					employee=new Employee();
					employee.setEmployeeId(rs.getInt("employeeId"));//rs.getXXX("列名")
					employee.setEmployeeName(rs.getString("employeeName"));
					employee.setEmployeeSex(rs.getString("employeeSex"));
					employee.setEmployeeAge(rs.getString("employeeAge"));
					employee.setEmployeeDept(rs.getString("employeeDept"));
					employee.setEmployeepost(rs.getString("employeepost"));
					employee.setEmployeeTel(rs.getInt("employeeTel"));
					employee.setEmployeeEmail(rs.getString("employeeEmail"));
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				dbHelper.closeAllObject();
			}
			return employee; 
		}
		
//		public Employee getEmployeeByName(int employeeName) {
//			String sql = "SELECT `employeeId`,`employeeName`,`employeeSex`,`employeeAge`,`employeeDept`,`employeepost`,`employeeTel`,`employeeEmail`\r\n" + 
//					"FROM `employee` where employeeName=?";
//			Employee employee=null;	
//			try {
//				ResultSet rs=dbHelper.executeQueryForPreparedStatement(sql, employeeName);
//				while(rs.next()) {
//					employee=new Employee();
//					employee.setEmployeeId(rs.getInt("employeeId"));//rs.getXXX("列名")
//					employee.setEmployeeName(rs.getString("employeeName"));
//					employee.setEmployeeSex(rs.getString("employeeSex"));
//					employee.setEmployeeAge(rs.getString("employeeAge"));
//					employee.setEmployeeDept(rs.getString("employeeDept"));
//					employee.setEmployeepost(rs.getString("employeepost"));
//					employee.setEmployeeTel(rs.getInt("employeeTel"));
//					employee.setEmployeeEmail(rs.getString("employeeEmail"));
//				}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}finally{
//				dbHelper.closeAllObject();
//			}
//			return employee;
//		}
}
