import static org.junit.Assert.assertNull;

import java.util.ArrayList;

public class CategoryDB {

	public static ArrayList<Category> categoryList = new ArrayList<Category>();

	public static void addCategory(Category category1) {
		// TODO Auto-generated method stub
		categoryList.add(category1);
	}
	
	public static void deleteCategory(Category userInput) {
		for (int i=0; i < CategoryDB.categoryList.size(); i++ ) {
			if (CategoryDB.categoryList.get(i) == userInput) {
				CategoryDB.categoryList.remove(i);
			}
		}
	}
	public static String viewCategory() {
		String output = "";
		for (int i=0; i < CategoryDB.categoryList.size(); i++) {
			output += CategoryDB.categoryList.get(i).getCategoryName();
					
		}
		return output;
		
	}
	public static void searchCategory(String userSearch) {
		for (int i=0; i < CategoryDB.categoryList.size(); i++) {
			String partialSearch = userSearch;
			String Search = CategoryDB.categoryList.get(i).getCategoryName();
			if (Search == partialSearch || Search.contains(partialSearch)) {
				System.out.println(Search);
			}
			else {
				System.out.println("Search not found. Please try again");
			}
		}
	}
	public static void updateCategory(String userUpdate, String userUpdate2) {
		for (int i=0; i < CategoryDB.categoryList.size(); i++) {
			String searchUpdate = userUpdate;
			String Search = CategoryDB.categoryList.get(i).getCategoryName();
			if (Search == searchUpdate || Search.contains(searchUpdate)) {
				CategoryDB.categoryList.get(i).setCategoryName(userUpdate2);
			}
		}
	}
	public static String viewItemsCategory() {
		String output = "";
		for (int i=0; i < CategoryDB.categoryList.size(); i++) {
			output += ItemDB.itemList.size();
	}
		return output;
	}
	
}
