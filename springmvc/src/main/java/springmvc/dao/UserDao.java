package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import springmvc.entity.Login;
import springmvc.entity.User;

@Component("userdao")
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private User user;
	@Autowired
	private Login login;
	
	
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
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
	public Login search(Login login) {
		String query="select * from ninja where email="+"'"+login.getUseremail()+"'"+" and userpass="+"'"+login.getPassword()+"';";
		System.out.println(query);
		try {
			Login l=this.jdbcTemplate.queryForObject(query,new RowMapperImpl());
			return l;
		}catch(EmptyResultDataAccessException e) {
			Login lo = new Login();
			System.out.println("for null pointer Exception");
			lo.setPassword("0");
			lo.setUseremail("0");
			lo.setUserName("0");
			return lo;
		}
		
	}
	
}
