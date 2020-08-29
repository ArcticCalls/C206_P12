import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int loginOption = 0;
		while (loginOption != 3) {

			C206_CaseStudy.loginSystem();
			loginOption = Helper.readInt("Please enter Option: ");
			if (loginOption == 1) { // Login Option
				String userid = Helper.readString("User ID: ");
				String password = Helper.readString("Password: ");

				System.out.println("Logging in....");
				int option = 0;
				while (option != 5) {
					C206_CaseStudy.menu();
					option = Helper.readInt("Please enter your option: ");
					if (option == 1) {
						C206_CaseStudy.userMenu();
						int useroption = Helper.readInt("Please enter your option");

						if (useroption == 1) { // add user
							String role = "user";
							boolean status = true;
							String useridAdd = Helper.readString("Enter userid:");
							String email = Helper.readString("Enter email:");
							String password1 = Helper.readString("Enter Password:");
							UserDB.userArray.add(new User(useridAdd, email, role, password1, status));
							System.out.println("User Added");
						} else if (useroption == 2) {// delete user by email
							String email = Helper.readString("Enter user email to delete:");
							UserDB.deleteUser(email);
						} else if (useroption == 3) { // view user
							System.out.println("User List:");
							UserDB.viewUser();
						} else if (useroption == 4) { // block/unblock user
							String userid1 = Helper.readString("Enter userid:");
							boolean status = Helper.readBoolean(
									"Enter true or false to set status of user to block or unblock respectivly: ");
							UserDB.statusUser(userid1, status);
						} else if (useroption == 5) { // edit user
							String user1 = Helper.readString("Enter userid to edit:");
							String useridnew = Helper.readString("New UserID:");
							String email = Helper.readString("Enter email:");
							String newpassword = Helper.readString("Enter new password:");
							String role = "user";
							boolean status = false;
							UserDB.editUser(user1, useridnew, email, role, newpassword, status);
						} else if (useroption == 6) { // quit usermenu
							System.out.println("Quitting User Menu...");
							break;
						}
					} else if (option == 2) {
						int userInput = Helper.readInt("Please enter your option:");

						if (userInput == 1) {
							String category1 = Helper.readString("Please enter the category name to add:");
							CategoryDB.addCategory(new Category(category1));
						}
						else if (userInput == 2) {
							String userInput1 = Helper.readString("Please enter the category name to delete:");
							if (ItemDB.itemList.size() == 0) {
								CategoryDB.deleteCategory(userInput1);
							}
							else {
								System.out.println("There are still items in the category.");
							}
						}
						else if (userInput == 3) {
							CategoryDB.viewCategory();
						}
						else if (userInput == 4) {
							String userSearch = Helper.readString("Please enter full name or partial name of category to search:");
							CategoryDB.searchCategory(userSearch);
						}
						else if (userInput == 5) {
							String userUpdate = Helper.readString("Please enter category name to update");
							String userUpdate2 = Helper.readString("Please enter new category name to update:");
							CategoryDB.updateCategory(userUpdate, userUpdate2);
						}
						else if (userInput == 6) {
							CategoryDB.viewItemsCategory();
						}
						else if (userInput == 7) {
							System.exit(userInput);
						}
						else {
							System.out.println("Invalid Option selected. Please try again");
						}

					} else if (option == 3) {

					} else if (option == 4) {

					} else {
						System.out.println("Invalid Option");
					}
				}

			} else if (loginOption == 2) { // Register Option
				System.out.println("Register:");
				String role = "user";
				boolean status = true;
				String userid = Helper.readString("Enter userid: ");
				String email = Helper.readString("Enter email: ");
				String password = Helper.readString("Enter Password: ");
				UserDB.userArray.add(new User(userid, email, role, password, status));
				System.out.println("Register was Successful");
			} else if (loginOption == 3) {
				System.out.println("Closing Application");
			} else {
				System.out.println("Invalid Option");
			}
		}

	} // end of Main

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

	public static void loginSystem() {
		System.out.println("Login System:");
		System.out.println("1. Login in");
		System.out.println("2. Register");
		System.out.println("3. Quit");
	}

	public static void userMenu() {
		System.out.println("User Menu:");
		System.out.println("1. Add User");
		System.out.println("2. Delete User");
		System.out.println("3. View User");
		System.out.println("4. Block/Unblock User");
		System.out.println("5. Edit User");
		System.out.println("6. Quit");
	}

	public static void categoryMenu() {
		System.out.println("Category Menu:");
		System.out.println("1. Add Category");
		System.out.println("2. Delete Category");
		System.out.println("3. View Category");
		System.out.println("4. Search Item by Full or Partial Name");
		System.out.println("5. Update Category Name");
		System.out.println("6. Display number of items in each category");
		System.out.println("7. Quit");
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
