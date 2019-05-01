package com.xyz.ekart.repository;

import javax.inject.Inject;

import com.xyz.ekart.model.ClassRoom;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import play.db.ebean.EbeanConfig;
import play.db.ebean.EbeanDynamicEvolutions;

public class ClassRoomRepository {

	private final EbeanServer ebeanServer;

	@Inject
	public ClassRoomRepository(EbeanConfig ebeanConfig, EbeanDynamicEvolutions ebeanDynamicEvolutions) {
		this.ebeanServer = Ebean.getServer(ebeanConfig.defaultServer());
	}
	
	public ClassRoom findById(Long id) {
		return ebeanServer.find(ClassRoom.class,id);
	}
	
	
}
