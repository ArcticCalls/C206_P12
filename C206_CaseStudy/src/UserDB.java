import java.util.ArrayList;

public class UserDB {
	//Array List for user class to add, delete, edit, block and unblock users
	public static ArrayList<User> userArray = new ArrayList<>();
	
	
	
	//add user
	public static void addUser(User user1) {
		userArray.add(user1);
	}
	
	
	
	//delete user via email
	public static void deleteUser(String email) {
		for(int i =0; i <userArray.size(); i++) {
			if(UserDB.userArray.get(i).getEmail() == email) {
				UserDB.userArray.remove(i);
			}
		}
	}
	
	//set Status of user (block/unblock)
	public static void statusUser(String user1, boolean status) {
		for(int i =0; i<userArray.size(); i++) {
			if(UserDB.userArray.get(i).getUserID() == user1) {
				UserDB.userArray.get(i).setStatus(status);
			}
		}
	}
	//edit User
	public static void editUser(String user1, String userid, String email, String role,String password, boolean status) {
		for(int i=0; i<userArray.size(); i++) {
			if(UserDB.userArray.get(i).getUserID() == user1) {
				UserDB.userArray.get(i).setUserID(userid);
				UserDB.userArray.get(i).setEmail(email);
				UserDB.userArray.get(i).setRole(role);
				UserDB.userArray.get(i).setStatus(status);
				UserDB.userArray.get(i).setPassword(password);
			}
		}
	}
	//view users
	public static String viewUser() {
		String output = "";
		for(int i =0; i< UserDB.userArray.size(); i++) {
			 output+= String.format("User:%s \nEmail:%s",UserDB.userArray.get(i).getUserID(),UserDB.userArray.get(i).getEmail());
			 System.out.println(output);
		}
		return output;
	}
	
	
}// end of class
