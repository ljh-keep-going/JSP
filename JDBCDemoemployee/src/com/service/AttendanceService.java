package com.service;

import java.util.List;

import com.entity.Attendance;

public interface AttendanceService {
	int saveAttendance(Attendance attendance);
	List<Attendance> getAttendanceList();
	int updateAttendance(Attendance attendance);//修改
	int delAttendance(int attendanceId);//删除
	Attendance getAttendanceById(int attendanceId);//查询单个
}