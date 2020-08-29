import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserTest {
	
	private ArrayList<User> userArray;
	
	public UserTest() {
		super();
	}
	
	private User u1;
	private User u2;
	
	@Before
	public void setup() throws Exception{
		//test users
		u1 = new User("TestUser1","Testuser1@gmail.com","admin","123",true);
		u2 = new User("TestUser2","Testuser2@gmail.com","user","456",false);
		
		userArray = new ArrayList<User>();
	}
	
	@Test
	public void addUser() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid user arraylist to add to", userArray);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		userArray.add(u1);
		assertEquals("Check that Camcorder arraylist size is 1", 1, UserDB.userArray.size());
		assertSame("Check that Camcorder is added", u1, UserDB.userArray.get(0));
	}
	@Test
	public void delUser() {
		//User list is not null, so that can delete a user
		assertNotNull("check if there is a valid user arraylist to delete from", userArray);
		userArray.add(u1);
		userArray.add(u2);
		userArray.remove(u1);
		assertEquals("Check if user arraylist has been decrease by 1",1, userArray.size());
		//check if u2 is the only one left
		assertSame("Check if u2 is the only one left",u2, userArray.get(0));
	}
	
}
