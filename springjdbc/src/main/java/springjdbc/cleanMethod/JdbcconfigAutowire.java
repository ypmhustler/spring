package springjdbc.cleanMethod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"springjdbc.cleanMethod.dao","springjdbc.cleanMethod.entity"})

public class JdbcconfigAutowire {

	
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
}
