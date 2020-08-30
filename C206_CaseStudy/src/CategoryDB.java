import static org.junit.Assert.assertNull;

import java.util.ArrayList;

public class CategoryDB {

	public static ArrayList<Category> categoryList = new ArrayList<Category>();

	public static void addCategory(Category category1) {
		// TODO Auto-generated method stub
		categoryList.add(category1);
		System.out.println("Category name has been added");
	}
	
	public static void deleteCategory(String userInput) {
		
		for (int i=0; i < CategoryDB.categoryList.size(); i++ ) {
			
			
			if (CategoryDB.categoryList.get(i).getCategoryName().equalsIgnoreCase(userInput)) {	
				CategoryDB.categoryList.remove(i);
				System.out.println("Category has been deleted");
			}
		}
	}
	public static String viewCategory() {
		String output = "";
		for (int i=0; i < CategoryDB.categoryList.size(); i++) {
			output = CategoryDB.categoryList.get(i).getCategoryName();
			System.out.println(output);
		}
		return output;
		
		
	}
	public static void searchCategory(String userSearch) {
		for (int i=0; i < CategoryDB.categoryList.size(); i++) {
			String partialSearch = userSearch;
			String Search = CategoryDB.categoryList.get(i).getCategoryName();
			if (Search.equalsIgnoreCase(partialSearch) || Search.contains(partialSearch)) {
				System.out.println(Search);
			}
			
			else {
				
			}
		}
	}
	public static void updateCategory(String userUpdate, String userUpdate2) {
		for (int i=0; i < CategoryDB.categoryList.size(); i++) {
			String searchUpdate = userUpdate;
			String Search = CategoryDB.categoryList.get(i).getCategoryName();
			if (Search.equalsIgnoreCase(searchUpdate)) {
				CategoryDB.categoryList.get(i).setCategoryName(userUpdate2);
				System.out.println("Category name has been updated");
			}
		}
	}
	public static int viewItemsCategory() {
		int output = 0;
		for (int i=0; i < CategoryDB.categoryList.size(); i++) {
			output = ItemDB.itemList.size();
			System.out.println(CategoryDB.categoryList.get(i).getCategoryName()+": "+output+ " Items");
	}
		return output;
	}

	
}
