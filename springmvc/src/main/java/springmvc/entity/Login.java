package springmvc.entity;

import org.springframework.stereotype.Component;

@Component
public class Login {

	private String useremail;
	private String Password;
	private String userName;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Login [useremail=" + useremail + ", Password=" + Password + ", userName=" + userName + "]";
	}
	
}
