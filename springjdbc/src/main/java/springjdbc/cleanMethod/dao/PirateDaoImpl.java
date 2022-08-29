package springjdbc.cleanMethod.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import springjdbc.cleanMethod.entity.PirateEmp;

@Component("daoimpl")
public class PirateDaoImpl {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
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
	
	public void change(PirateEmp p) {
		String query="update pirate set DevilFruit=? ,title=? where name=?;";
		System.out.println("..................");
		System.out.println(p.getName()+p.getDevilfruit()+p.getTitle());
		int res=this.jdbcTemplate.update(query,p.getName(),p.getDevilfruit(),p.getTitle());
		System.out.println(res);
	}
	
	public void delete(PirateEmp p) {
		String query="delete from pirate where name=?;";
		System.out.println("..................");
		System.out.println(p.getName());
		int res=this.jdbcTemplate.update(query,p.getName());
		System.out.println(res);
	}
	
	public PirateEmp select (String name) {
		String query="select* from pirate where name=?";
		//RowMapperImpl rowmapper=new RowMapperImpl();
		PirateEmp p=this.jdbcTemplate.queryForObject(query,new RowMapperImpl(),name);
		return p;
		
	}
	public List<PirateEmp> getAllPirateKing(){
		String query="select * from pirate;";
		List<PirateEmp> p=this.jdbcTemplate.query(query, new RowMapperImpl());
		return p;
	}
	

}
