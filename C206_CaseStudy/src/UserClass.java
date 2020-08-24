
public class UserClass {
	
	private String userID;
	private String email;
	private String status;
	public UserClass(String userID, String email, String status) {
		super();
		this.userID = userID;
		this.email = email;
		this.status = status;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
