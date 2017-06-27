package com.spring.practice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class NamedEmployeeDao {
	private NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	public void setDataSource(DataSource jdbc) throws SQLException {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
		System.out.println(jdbc.getConnection());
	}

	public List<Employee> employeesDetails() {
		//MapSqlParameterSource params = new MapSqlParameterSource("name","Anita");
	
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("name", "Anita");
		
		return jdbc.query("select * from employee where name = :name", params,new RowMapper<Employee>() {

			public Employee mapRow(ResultSet rs, int rownum) throws SQLException {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setEmail(rs.getString("email"));
				emp.setText(rs.getString("text"));

				return emp;
			}
		});

	}
	
	public Employee employeesDetails(int id) {
		//MapSqlParameterSource params = new MapSqlParameterSource("name","Anita");
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id", id);
		
		return jdbc.queryForObject("select * from employee where id = :id", params,new RowMapper<Employee>() {

			public Employee mapRow(ResultSet rs, int rownum) throws SQLException {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setEmail(rs.getString("email"));
				emp.setText(rs.getString("text"));

				return emp;
			}
		});

	}

}
