package com.verizon.adb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.adb.dao.ConnectionRepository;
import com.verizon.adb.model.Connection;

@Service
public class ConnectionServiceImpl {

	@Autowired
	private ConnectionRepository connectionRepo;
	
	public List<Connection> getAllConnections() {
		return connectionRepo.findAll();
	}

}
