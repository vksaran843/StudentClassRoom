package com.xyz.ekart.dto;

public class AddStudentRequestDto {

	private long classRoomId;
	
	private String studentName;
	
	private String fatherName;

	public long getClassRoomId() {
		return classRoomId;
	}

	public void setClassRoomId(long classRoomId) {
		this.classRoomId = classRoomId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	
}
