package springjdbc.cleanMethod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import springjdbc.cleanMethod.dao.PirateDaoImpl;
import springjdbc.cleanMethod.entity.PirateEmp;

@Configuration
public class Jdbcconfig {
	
	@Bean(name="ds")
	public DriverManagerDataSource getDatasource() {
		
		DriverManagerDataSource ds1=new DriverManagerDataSource();
		ds1.setDriverClassName("com.mysql.jdbc.Driver");
		ds1.setUrl("jdbc:mysql://localhost:8000/data");
		ds1.setUsername("root");
		ds1.setPassword("Yashu");
		return ds1;
		
	}
	@Bean(name="jdbcTemplate")
	public JdbcTemplate getjdbcTemplate() {
		JdbcTemplate jd=new JdbcTemplate();
		jd.setDataSource(getDatasource());
		return jd;
	}
	@Bean(name="emp")
	public PirateEmp getpirateEmp() {
		PirateEmp em=new PirateEmp();
		return em;
	}
	@Bean(name="daoimpl")
	public PirateDaoImpl getPirateDaoImpl() {
		PirateDaoImpl dao=new PirateDaoImpl();
		dao.setJdbcTemplate(getjdbcTemplate());
		dao.setP(getpirateEmp());
		return dao;
			
	}

}
