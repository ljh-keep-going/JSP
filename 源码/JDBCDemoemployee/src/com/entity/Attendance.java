package com.entity;

public class Attendance {

	private Integer attendanceId;
	private String attendanceName;
	private String attendanceDept;
	private String attendancePost;
	private String attendanceGet;
	private String attendanceLate;
	private String attendanceAdd;
	private String attendanceCard;
	private String attendanceCond;
	
	
	
	
	public Attendance() {
		super();
	}
	public Attendance(String attendanceName, String attendanceDept, String attendancePost, String attendanceGet,
			String attendanceLate, String attendanceAdd, String attendanceCard, String attendanceCond) {
		super();
		this.attendanceName = attendanceName;
		this.attendanceDept = attendanceDept;
		this.attendancePost = attendancePost;
		this.attendanceGet = attendanceGet;
		this.attendanceLate = attendanceLate;
		this.attendanceAdd = attendanceAdd;
		this.attendanceCard = attendanceCard;
		this.attendanceCond = attendanceCond;
	}
	public Attendance(Integer attendanceId, String attendanceName, String attendanceDept, String attendancePost,
			String attendanceGet, String attendanceLate, String attendanceAdd, String attendanceCard,
			String attendanceCond) {
		super();
		this.attendanceId = attendanceId;
		this.attendanceName = attendanceName;
		this.attendanceDept = attendanceDept;
		this.attendancePost = attendancePost;
		this.attendanceGet = attendanceGet;
		this.attendanceLate = attendanceLate;
		this.attendanceAdd = attendanceAdd;
		this.attendanceCard = attendanceCard;
		this.attendanceCond = attendanceCond;
	}
	public Integer getAttendanceId() {
		return attendanceId;
	}
	public void setAttendanceId(Integer attendanceId) {
		this.attendanceId = attendanceId;
	}
	public String getAttendanceName() {
		return attendanceName;
	}
	public void setAttendanceName(String attendanceName) {
		this.attendanceName = attendanceName;
	}
	public String getAttendanceDept() {
		return attendanceDept;
	}
	public void setAttendanceDept(String attendanceDept) {
		this.attendanceDept = attendanceDept;
	}
	public String getAttendancePost() {
		return attendancePost;
	}
	public void setAttendancePost(String attendancePost) {
		this.attendancePost = attendancePost;
	}
	public String getAttendanceGet() {
		return attendanceGet;
	}
	public void setAttendanceGet(String attendanceGet) {
		this.attendanceGet = attendanceGet;
	}
	public String getAttendanceLate() {
		return attendanceLate;
	}
	public void setAttendanceLate(String attendanceLate) {
		this.attendanceLate = attendanceLate;
	}
	public String getAttendanceAdd() {
		return attendanceAdd;
	}
	public void setAttendanceAdd(String attendanceAdd) {
		this.attendanceAdd = attendanceAdd;
	}
	public String getAttendanceCard() {
		return attendanceCard;
	}
	public void setAttendanceCard(String attendanceCard) {
		this.attendanceCard = attendanceCard;
	}
	public String getAttendanceCond() {
		return attendanceCond;
	}
	public void setAttendanceCond(String attendanceCond) {
		this.attendanceCond = attendanceCond;
	}
	
	
}	