package com.xyz.ekart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.ebean.Model;

@Entity
@Table(name="CLASSROOM")
public class ClassRoom extends Model{

	@Id
	@Column(name ="CLASSROOM_ID")
	private Long classRoomId;
	
	@Column(name ="CLASSROOM_NAME")
	private String classRoomName;
	
	@Column(name ="CAPACITY")
	private Long capacity;     //capacity per division
	
	@Column(name ="TOTAL_DIVISIONS")
	private Long totalDivisions;  // Number Of divisions;

	public Long getClassRoomId() {
		return classRoomId;
	}

	public void setClassRoomId(Long classRoomId) {
		this.classRoomId = classRoomId;
	}

	public String getClassRoomName() {
		return classRoomName;
	}

	public void setClassRoomName(String classRoomName) {
		this.classRoomName = classRoomName;
	}

	public Long getCapacity() {
		return capacity;
	}

	public void setCapacity(Long capacity) {
		this.capacity = capacity;
	}

	public Long getTotalDivisions() {
		return totalDivisions;
	}

	public void setTotalDivisions(Long totalDivisions) {
		this.totalDivisions = totalDivisions;
	}

	@Override
	public String toString() {
		return "ClassRoom [classRoomId=" + classRoomId + ", classRoomName=" + classRoomName + ", capacity=" + capacity
				+ ", totalDivisions=" + totalDivisions + "]";
	}
	
	
}
