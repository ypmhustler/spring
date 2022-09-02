package springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import springmvc.entity.Login;
import springmvc.entity.User;

public class RowMapperImpl implements RowMapper<Login > {

	
	// row mapper is used for select query
	public Login mapRow(ResultSet rs, int rowNum) throws SQLException {
		Login pe= new Login();
		pe.setUseremail(rs.getString(1));
		pe.setPassword(rs.getString(3));
		pe.setUserName(rs.getString(2));
		return pe;
	}
	

}
