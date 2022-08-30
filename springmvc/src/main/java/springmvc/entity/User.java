package springmvc.entity;

public class User {

	private String userName;
	private String userpass;
	private String email;
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userpass=" + userpass + ", email=" + email + "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
