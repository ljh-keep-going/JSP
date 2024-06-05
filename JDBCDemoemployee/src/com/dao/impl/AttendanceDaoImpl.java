
package com.dao.impl;
/**
 * 操作具体表的增删改查
 * @author Attendance
 *
 */

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.AttendanceDao;
import com.entity.Attendance;
import com.util.DBHelper;

public class AttendanceDaoImpl implements AttendanceDao{
	private DBHelper dbHelper=DBHelper.getInstance();
	//新增
	public int saveAttendance(Attendance attendance) {
		String sql = "INSERT INTO `attendance`(`attendanceName`,`attendanceDept`,`attendancePost`,`attendanceGet`,`attendanceLate`,`attendanceAdd`,`attendanceCard`,`attendanceCond`)\r\n" + 
				"VALUES(?,?,?,?,?,?,?,?)";
		return dbHelper.executeUpdateForPreparedStatement(sql, 
				attendance.getAttendanceName(),attendance.getAttendanceDept(),attendance.getAttendancePost(),
				attendance.getAttendanceGet(),attendance.getAttendanceLate(),attendance.getAttendanceAdd(),
				attendance.getAttendanceCard(),attendance.getAttendanceCond());
	}
	//查询
	public List<Attendance> getAttendanceList(){
		List<Attendance> attendances = new ArrayList<Attendance>();
		String sql = "SELECT * FROM `attendance`";
		try {
			ResultSet rs=dbHelper.executeQueryForPreparedStatement(sql, null);
			Attendance attendance=null;
			while(rs.next()) {
				attendance=new Attendance();
				attendance.setAttendanceId(rs.getInt("attendanceId"));//rs.getXXX("列名")
				attendance.setAttendanceName(rs.getString("attendanceName"));
				attendance.setAttendanceDept(rs.getString("attendanceDept"));
				attendance.setAttendancePost(rs.getString("attendancePost"));
				attendance.setAttendanceGet(rs.getString("attendanceGet"));
				attendance.setAttendanceLate(rs.getString("attendanceLate"));
				attendance.setAttendanceAdd(rs.getString("attendanceAdd"));
				attendance.setAttendanceCard(rs.getString("attendanceCard"));
				attendance.setAttendanceCond(rs.getString("attendanceCond"));
				
				attendances.add(attendance);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return attendances;
	}
	//修改
		@Override
		public int updateAttendance(Attendance attendance) {
			String sql="update attendance set attendanceName=?,attendanceDept=?,attendancePost=?,attendanceGet=?,attendanceLate=?,attendanceAdd=?,attendanceCard=?,attendanceCond=? where attendanceId=?";
			return dbHelper.executeUpdateForPreparedStatement(sql, 
					attendance.getAttendanceName(),attendance.getAttendanceDept(),attendance.getAttendancePost(),
					attendance.getAttendanceGet(),attendance.getAttendanceLate(),attendance.getAttendanceAdd(),
					attendance.getAttendanceCard(),attendance.getAttendanceCond(),attendance.getAttendanceId());
		}
		//删除
		@Override
		public int delAttendance(int attendanceId) {
			String sql="delete from attendance where attendanceId=?";
			return dbHelper.executeUpdateForPreparedStatement(sql, attendanceId);
		}
		//查询单个：通过id获取单个对象
		@Override
		public Attendance getAttendanceById(int attendanceId) {
			String sql = "SELECT `attendanceId`,`attendanceName`,`attendanceDept`,`attendancePost`,`attendanceGet`,`attendanceLate`,`attendanceAdd`,`attendanceCard`,`attendanceCond`\r\n" + 
					"FROM `attendance` where attendanceId=?";
			Attendance attendance=null;		
			try {
				ResultSet rs=dbHelper.executeQueryForPreparedStatement(sql, attendanceId);
				while(rs.next()) {
					attendance=new Attendance();
					attendance.setAttendanceId(rs.getInt("attendanceId"));//rs.getXXX("列名")
					attendance.setAttendanceName(rs.getString("attendanceName"));
					attendance.setAttendanceDept(rs.getString("attendanceDept"));
					attendance.setAttendancePost(rs.getString("attendancePost"));
					attendance.setAttendanceGet(rs.getString("attendanceGet"));
					attendance.setAttendanceLate(rs.getString("attendanceLate"));
					attendance.setAttendanceAdd(rs.getString("attendanceAdd"));
					attendance.setAttendanceCard(rs.getString("attendanceCard"));
					attendance.setAttendanceCond(rs.getString("attendanceCond"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				dbHelper.closeAllObject();
			}
			return attendance;
		}

}
