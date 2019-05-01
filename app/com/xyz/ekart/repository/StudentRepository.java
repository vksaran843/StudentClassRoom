package com.xyz.ekart.repository;


import java.util.List;

import javax.inject.Inject;

import com.xyz.ekart.model.Student;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import play.db.ebean.EbeanConfig;
import play.db.ebean.EbeanDynamicEvolutions;

public class StudentRepository {

	private final EbeanServer ebeanServer;

	@Inject
	public StudentRepository(EbeanConfig ebeanConfig, EbeanDynamicEvolutions ebeanDynamicEvolutions) {
		this.ebeanServer = Ebean.getServer(ebeanConfig.defaultServer());
	}
	
	public Student findById(Long id) {
		return ebeanServer.find(Student.class,id);
	}
	
	public void save(Student student) {
		ebeanServer.save(student);
	}
	
	public List<Student> getAllStudent(Long classRoomId) {
		return ebeanServer.find(Student.class).where().eq("classRoomId.classRoomId", classRoomId).findList();
	}
	
	public Long getSeq(String seq) {
		
		String seqQuery = "select next value for "+seq+" as SEQ";
		return Long.valueOf(ebeanServer.createSqlQuery(seqQuery).findOne().getString("SEQ"));
		
	}
}
