import java.util.ArrayList;

public class C206_CaseStudy {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array List for user class to add, delete, block and unblock users
		ArrayList<UserClass> userArray = new ArrayList<>();
		
		
		int option =0;
		
		while(option !=5) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Please enter your option");
			
			if(option == 1) {
				//user menu
				C206_CaseStudy.userMenu();
				int useroption = Helper.readInt("Please enter your option");
				if(useroption == 1) {
					// new users are not block
					String status = "unblock";
					String userid = Helper.readString("Please enter userid: ");
					String email = Helper.readString("Please enter email: ");
					//add user into array list
					userArray.add(new UserClass("userid","email",status));
					
					
				}else if(useroption == 2) {
					String userid = Helper.readString("Please enter userid: ");
					for(int i =0; i<userArray.size(); i++) {
						if(userArray.get(i).getUserID() == userid) {
							userArray.remove(i);
						}
					}
				}else if(useroption == 3) /* block user */ {
					String userid = Helper.readString("Please enter userid: ");
					String status = Helper.readString("enter 'block' to block users: ");
					for(int i =0; i<userArray.size(); i++) {
						if(userArray.get(i).getUserID() == userid) {
							userArray.get(i).setStatus(status);
						}
					}
					
					
				}else if(useroption == 4) /* unblock user */ {
					String userid = Helper.readString("Please enter userid: ");
					String status = Helper.readString("enter 'unblock' to unblock users: ");
					for(int i =0; i<userArray.size(); i++) {
						if(userArray.get(i).getUserID() == userid) {
							userArray.get(i).setStatus(status);
						}
					}
				}else {
					System.out.println("Invalid Option");
				}
			}
		}
		

		
	}
	
	// Menu(s)
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
		System.out.println("3. Block User");
		System.out.println("4. Unblock User");
		System.out.println("5. Quit");
	}
	
	public static void categoryMenu() {
		System.out.println("Category Menu:");
		System.out.println("1. Add Category");
		System.out.println("2. Delete Category");
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
