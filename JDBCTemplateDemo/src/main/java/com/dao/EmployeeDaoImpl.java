package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.dao.rowmapper.EmployeeRowMapper;
import com.dto.Employee;

@Component("edao")
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getName(), employee.getSalary());
		return result;
	}

	public int update(Employee employee) {
		String sql = "update employee set id=? where name=?";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getName());

		return result;
	}

	public int delete(int id) {
		String sql = "delete from employee where id=?";
		jdbcTemplate.update(sql, id);
		return 0;
	}

//for single row
	public Employee read(int id) {
		String sql = "select * from employee where id=?";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		Employee employee = jdbcTemplate.queryForObject(sql, rowmapper, id);
		return employee;
	}

//for multiple rows
	public List<Employee> read() {
		String sql = "select * from employee";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		List<Employee> result = jdbcTemplate.query(sql, rowmapper);
		return result;
	}
}
