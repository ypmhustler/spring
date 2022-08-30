package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import springmvc.entity.User;

@Component("userdao")
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private User user;
	
	
	public UserDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	public void insert(User user) {
		String query="insert into ninja(email,userName,userpass) values(?,?,?)";
		int res=this.jdbcTemplate.update(query,user.getEmail(),user.getUserName(),user.getUserpass());
		System.out.println(res);
	}
	
}
