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
	public static void viewCategory() {
		for (int i=0; i < CategoryDB.categoryList.size(); i++) {
			System.out.println(CategoryDB.categoryList.get(i));
		}
	}
	
}
