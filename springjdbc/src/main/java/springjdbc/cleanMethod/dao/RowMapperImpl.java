package springjdbc.cleanMethod.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import springjdbc.cleanMethod.entity.PirateEmp;

public class RowMapperImpl implements RowMapper<PirateEmp > {

	public PirateEmp mapRow(ResultSet rs, int rowNum) throws SQLException {
		PirateEmp pe= new PirateEmp();
		pe.setName(rs.getString(1));
		pe.setDevilfruit(rs.getString(2));
		pe.setTitle(rs.getString(3));		
		return pe;
	}

}
