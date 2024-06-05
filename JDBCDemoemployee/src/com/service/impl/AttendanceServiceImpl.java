package com.service.impl;

import java.util.List;

import com.dao.AttendanceDao;
import com.dao.impl.AttendanceDaoImpl;
import com.entity.Attendance;
import com.service.AttendanceService;

public class AttendanceServiceImpl implements AttendanceService {
	private AttendanceDao attendanceDao=new AttendanceDaoImpl();
	public int saveAttendance(Attendance attendance) {
		// TODO Auto-generated method stub
		return attendanceDao.saveAttendance(attendance);
	}

	public List<Attendance> getAttendanceList() {
		// TODO Auto-generated method stub
		return attendanceDao.getAttendanceList();
	}

	public int updateAttendance(Attendance attendance) {
		// TODO Auto-generated method stub
		return attendanceDao.updateAttendance(attendance);
	}

	public int delAttendance(int attendanceId) {
		// TODO Auto-generated method stub
		return attendanceDao.delAttendance(attendanceId);
	}

	public Attendance getAttendanceById(int attendanceId) {
		// TODO Auto-generated method stub
		return attendanceDao.getAttendanceById(attendanceId);
	}

}
