package com.verizon.adb.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.adb.model.Connection;
import com.verizon.adb.service.ConnectionService;

@RestController
@CrossOrigin
@RequestMapping("/connections")
public class ConnectionApi {

	@Autowired
	private ConnectionService service;

	@GetMapping
	public ResponseEntity<List<Connection>> getAllConnections() {
		return new ResponseEntity<>(service.getAllConnections(), HttpStatus.OK);
	}
	
	
	
}
