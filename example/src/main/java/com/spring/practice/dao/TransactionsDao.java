package com.spring.practice.dao;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
public class TransactionsDao {
private NamedParameterJdbcTemplate jdbc;


	
	@Autowired
	public void setDataSource(DataSource jdbc) throws SQLException {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
		System.out.println(jdbc.getConnection());
	}
	
	@Transactional
public int[] batchUpdate(List<Employee> emp){
		
		SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(emp.toArray());
		return jdbc.batchUpdate("insert into employee(name,email,text)values(:name,:email,:text)", params);
	}

}
