
public class User {
	
	private String userID;
	private String email;
	private boolean status;
	
	
	
	public User(String userID, String email, boolean status) {
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
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	

	
	
	

}
