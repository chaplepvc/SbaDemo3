package com.verizon.adb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verizon.adb.model.Connection;

public interface ConnectionRepository extends JpaRepository<Connection, String> {

}
