
public class User {
	
	private String userID;
	private String email;
	private String role;
	private boolean status;
	
	public User(String userID, String email, String role, boolean status) {
		super();
		this.userID = userID;
		this.email = email;
		this.role = role;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
	

	
	
	

}
