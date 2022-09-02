package springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import springmvc.entity.User;

public class RowMapperUser implements RowMapper<User> {

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User pe= new User();
		pe.setEmail(rs.getString(1));
		pe.setUserpass(rs.getString(3));
		pe.setUserName(rs.getString(2));
		return pe;
	}

}
