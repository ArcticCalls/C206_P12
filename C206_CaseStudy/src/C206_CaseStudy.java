import java.util.ArrayList;

public class C206_CaseStudy {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array List for user class to add, delete, block and unblock users
		ArrayList<User> userArray = new ArrayList<>();
		
		
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
					boolean status = false;
					String userid = Helper.readString("Please enter userid: ");
					String email = Helper.readString("Please enter email: ");
					//add user into array list
					userArray.add(new User(userid,email,status));
					
					
				}else if(useroption == 2) {
					String userid = Helper.readString("Please enter userid: ");
					for(int i =0; i<userArray.size(); i++) {
						if(userArray.get(i).getUserID() == userid) {
							userArray.remove(i);
						}
					}
				}else if(useroption == 3) /* View user */ {
					String userid = Helper.readString("Please enter userid: ");
					String status = Helper.readString("enter 'block' to block users: ");
					for(int i =0; i<userArray.size(); i++) {
						if(userArray.get(i).getUserID() == userid) {
							System.out.println("User: " + userArray.get(i).getUserID()+"\n Email: " +userArray.get(i).getEmail() + " \n Status: "+ userArray.get(i).isStatus());
						}
					}
					
					
				}else if(useroption == 4) /* Block/Unblock user */ {
					String userid = Helper.readString("Please enter userid: ");
					boolean status = Helper.readBoolean("Please enter true to set user as block or false to set user as unblock: ");
					for(int i =0; i<userArray.size(); i++) {
						if(userArray.get(i).getUserID() == userid) {
							
						}
					}
				}else {
					System.out.println("Invalid Option");
				}
			}else if(option == 2) {
				//category menu - Jun Yang
				System.out.println("Category Menu");
				C206_CaseStudy.categoryMenu();
				int catOption = Helper.readInt("Please enter your option: ");
				if(catOption == 1) {
					System.out.println("Add Category:");
					String CatName = Helper.readString("Please enter category name: "); // - Wei Ren
					CategoryDB.categoryList.add(new Category(CatName)); // - Wei Ren
				
				} // Category Menu WIP
				
			}else if(option ==3) {
				//Bid Menu
				
			}else if(option == 4) {
				//Sell Menu
				
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
		System.out.println("6. Quit");
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
