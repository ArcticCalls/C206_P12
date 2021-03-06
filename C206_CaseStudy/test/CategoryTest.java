import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CategoryTest {

	private Category category1;
	private Category userInput;
	private String userInput2;
	private String userSearch;
	private String userUpdate;
	private String userUpdate2;
	@Before
	public void setUp() throws Exception {
		
		category1 = new Category("Artworks");
		userInput = new Category("Test Category to delete");
		userInput2 = ("Artworks");
		userSearch = ("Art");
		userUpdate = ("Artworks");
		userUpdate2 = ("Artworks of Mona Lisa");
	}

	@After
	public void tearDown() throws Exception {
		
		category1 = null;
		userInput = null;
		userSearch = null;
		userUpdate = null;
		userUpdate2 = null;
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
		//Test that the item has been added
		assertSame("Test that the item has been added", category1, CategoryDB.categoryList.get(0));
		
	}
	@Test
	public void deleteCategoryTest() {
		//Test that the categoryList is not null
		assertNotNull("Test that the categoryList is not null", CategoryDB.categoryList);
		//Test that the delete based on name works and that the correct name is deleted
		CategoryDB.addCategory(category1);
		CategoryDB.addCategory(userInput);
		CategoryDB.deleteCategory(userInput2);
		//Test that after the delete, the size of the arraylist decreases
		assertEquals("Test that the size of the array decreases",1,CategoryDB.categoryList.size());
	}
	@Test
	public void viewAllCategoryTest() {
		//Test that the categoryList is not null
		assertNotNull("Test that the categoryList is not null", CategoryDB.categoryList);
		//Test that the size of the array increases after adding 2 more items
		CategoryDB.addCategory(userInput);
		CategoryDB.addCategory(category1);
		assertEquals("Test that the size is 2", 2, CategoryDB.categoryList.size());
		//Test that the output is the same as the expected output
		String expectedOutput = CategoryDB.viewCategory();
		String testOutput = "Test Category to delete";
		testOutput = "Artworks";
		
		assertEquals("Test that the output is the same as the expected output", expectedOutput, testOutput);
	}
	@Test
	public void searchCategoryTest() {
		//Test that the categoryList is not null
		assertNotNull("Test that the categoryList is not null", CategoryDB.categoryList);
		//Test that the size of the array increases after adding 2 more items
		CategoryDB.addCategory(userInput);
		CategoryDB.addCategory(category1);
		//Test that the search function works
		CategoryDB.searchCategory(userSearch);
	}
	@Test
	public void updateCategoryTest() {
		//Test that the categoryList is not null
		assertNotNull("Test that the categoryList is not null", CategoryDB.categoryList);
		//Test that the size of the array increases after adding 2 more items
		CategoryDB.addCategory(userInput);
		CategoryDB.addCategory(category1);
		//Test that the update function works
		CategoryDB.updateCategory(userUpdate, userUpdate2);
	}
	@Test
	public void searchItemCategoryTest() {
		//Test that the categoryList is not null
		assertNotNull("Test that the categoryList is not null", CategoryDB.categoryList);
		//Test that the size of the array increases after adding 2 more items
		CategoryDB.addCategory(userInput);
		CategoryDB.addCategory(category1);
		//Test that the searchItemCategory works
		CategoryDB.viewItemsCategory();
	}

}

