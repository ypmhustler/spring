package springjdbc.cleanMethod.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import springjdbc.cleanMethod.entity.PirateEmp;

public class PirateDaoImpl {
	private JdbcTemplate jdbcTemplate;
	private PirateEmp p;
	
	
	public PirateEmp getP() {
		return p;
	}

	public void setP(PirateEmp p) {
		this.p = p;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public PirateDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void con(PirateEmp p) {
		String query="insert into pirate(name,DevilFruit,title) values(?,?,?)";
		System.out.println("..................");
		System.out.println(p.getName()+p.getDevilfruit()+p.getTitle());
		int res=this.jdbcTemplate.update(query,p.getName(),p.getDevilfruit(),p.getTitle());
		System.out.println(res);
	}
	

}
