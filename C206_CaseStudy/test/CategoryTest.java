import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CategoryTest {

	private Category category1;
	private Category userInput;
	@Before
	public void setUp() throws Exception {
		
		category1 = new Category("Artworks");
		userInput = new Category("Test Category to delete");
	}

	@After
	public void tearDown() throws Exception {
		
		category1 = null;
		userInput = null;
		CategoryDB.categoryList.clear();
	}

	@Test
	public void addCategoryTest() {
		//Test that the categoryList is not null
		assertNotNull("Test that the categoryList is not null", CategoryDB.categoryList);
		//Test the size of the categoryList is 0 after adding in an object
		assertEquals("Test that the size of the categoryList is 0 before adding any object", 0, CategoryDB.categoryList.size());
		//Test that the categoryList is 1 after adding in an object
		CategoryDB.addCategory(category1);
		assertEquals("Test that the size is 1", 1, CategoryDB.categoryList.size());
		//Test 4
		assertSame("Test 4", category1, CategoryDB.categoryList.get(0));
		
	}
	@Test
	public void deleteCategoryTest() {
		//Test that the categoryList is not null
		assertNotNull("Test that the categoryList is not null", CategoryDB.categoryList);
		//Test that the delete based on name works and that the correct name is deleted
		CategoryDB.addCategory(category1);
		CategoryDB.addCategory(userInput);
		CategoryDB.deleteCategory(userInput);
		//Test that after the delete, the size of the arraylist decreases
		assertEquals("Test that the size of the array decreases",1,CategoryDB.categoryList.size());
	}
	@Test
	public void viewAllCategoryTest() {
		//Test that the categoryList is not null
		assertNotNull("Test that the categoryList is not null", CategoryDB.categoryList);
		//Test that every element inside the array are displayed correctly
		CategoryDB.viewCategory();
	}

}
