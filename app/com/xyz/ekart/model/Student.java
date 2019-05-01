package com.xyz.ekart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.ebean.Model;

@Entity
@Table(name="STUDENT")
public class Student extends Model{

	@Id
	@Column(name ="STUDENT_ID")
	private Long studentId;
	
	@Column(name ="CLASSROOM_SEQ_ID")
	private Long classRoomSeqId;    //ROLL NUMBER OR ENROLLMENT NUMBER
	
	@Column(name ="STUDENT_NAME")
	private String studentName;
	
	@Column(name ="father_NAME")
	private String fatherName;
	
	@ManyToOne
	@JoinColumn(name ="CLASSROOM_ID")
	private ClassRoom classRoomId;
	
	@Column(name ="DIVISION")
	private String division;

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Long getClassRoomSeqId() {
		return classRoomSeqId;
	}

	public void setClassRoomSeqId(Long classRoomSeqId) {
		this.classRoomSeqId = classRoomSeqId;
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

	public ClassRoom getClassRoomId() {
		return classRoomId;
	}

	public void setClassRoomId(ClassRoom classRoomId) {
		this.classRoomId = classRoomId;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", classRoomSeqId=" + classRoomSeqId + ", studentName=" + studentName
				+ ", fatherName=" + fatherName + ", classRoomId=" + classRoomId + ", division=" + division + "]";
	}
	
	
	
}
