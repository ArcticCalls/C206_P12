import java.util.ArrayList;

public class C206_CaseStudy {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option =0;
		while(option !=5) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Please enter your option: ");
			if(option == 1) {
				C206_CaseStudy.userMenu();
				int useroption = Helper.readInt("Please enter your option");
				
				if(useroption == 1) { // add user
					String role = "user";
					boolean status = true;
					String userid = Helper.readString("Enter userid: ");
					String email = Helper.readString("Enter email: ");
					UserDB.userArray.add(new User(userid,email,role,status));
					
				}else if(useroption == 2) {//delete user by email
					String email = Helper.readString("Enter user email to delete: ");
					UserDB.deleteUser(email);
				}else if(useroption == 3) { //view user
					UserDB.viewUser();
				}else if(useroption == 4) { // block/unblock user
					String userid  = Helper.readString("Enter userid: ");
					String status
				}else if(useroption == 5) { // edit user
					
				}else if(useroption == 6 ) { // quit usermenu
					System.out.println("Quitting User Menu...");
					break;
				}
			}else if(option == 2) {
				
			}else if(option == 3) {
				
			}else if(option == 4) {
				
			}else {
				System.out.println("Invalid Option");
			}
		}
		
	}
	
	
	
	// Menu(s) - Jun Yang
	public static void menu() {
		System.out.println("Menu:");
		System.out.println("1. User Menu");
		System.out.println("2. Category Menu");
		System.out.println("3. Bid Menu");
		System.out.println("4. Sell Menu");
		System.out.println("5. Quit");
		Helper.line(80, "-");
	}
	
	public static void userMenu() {
		System.out.println("User Menu:");
		System.out.println("1. Add User");
		System.out.println("2. Delete User");
		System.out.println("3. View User");
		System.out.println("4. Block/Unblock User");
		System.out.println("5. Quit");
	}
	
	public static void categoryMenu() {
		System.out.println("Category Menu:");
		System.out.println("1. Add Category");
		System.out.println("2. Delete Category");
		System.out.println("3. View Category");
		System.out.println("3. Quit");
	}
	public static void bidMenu() {
		System.out.println("Bid Menu");
		System.out.println("1. Add bid");
		System.out.println("2. Delete bid");
		System.out.println("3. Quit");
	}
	
	public static void sellMenu() {
		System.out.println("Sell Menu");
		System.out.println("1. Add Item");
		System.out.println("2. Sell Item");
		System.out.println("3. Quit");
	}
	

}
