package com.spring.practice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class EmployeeDao {

	private JdbcTemplate jdbc;

	public JdbcTemplate getDataSource() {
		return jdbc;
	}
	@Autowired
	private SessionFactory sessionFactory;

	
	public Session session(){
		return sessionFactory.getCurrentSession();
	}
	@Autowired
	public void setDataSource(DataSource jdbc) throws SQLException {
		this.jdbc = new JdbcTemplate(jdbc);
		System.out.println(jdbc.getConnection());
	}

	public List<Employee> employeesDetails() {
		/*return jdbc.query("select * from employee", new RowMapper<Employee>() {

			public Employee mapRow(ResultSet rs, int rownum) throws SQLException {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setEmail(rs.getString("email"));
				emp.setText(rs.getString("text"));

				return emp;
			}
		});*/

		//with Lambda expressions
		 return jdbc.query("select * from employee", (rs,rownum)->{
			Employee emp = new Employee();
			emp.setId(rs.getInt("id"));
			emp.setName(rs.getString("name"));
			emp.setEmail(rs.getString("email"));
			emp.setText(rs.getString("text"));

			return emp;
		});
	}
	
	@SuppressWarnings("unchecked")
	public List<Employee> empDetails(){
		return session().createQuery("from Employee").list();
		
	}

}
