import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ItemsTest {
	private items item1;
	private items userInput;
	private ArrayList<items> itemList;
	private String userSearch;
	private String userUpdate;
	private String userUpdate2;
	
	public ItemsTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		
		item1 = new items("Dog plushie", "size: 10 inch", 20.00, "01/09/2020", "31/08/2021", 00.00);
		userInput = new items("Lego", "brick toy", 12.00, "20/08/2020", "20/10/2020", 2.00);
		userSearch = ("Toy");
		userUpdate = ("Soft toy");
		userUpdate2 = ("Plushie");
	}

	@After
	public void tearDown() throws Exception {
		
		item1 = null;
		userInput = null;
		ItemDB.itemList.clear();
	}
	
	@Test
	public void addItemTest() {
		//Test that the itemList is not null
		assertNotNull("Check if there is valid items arraylist to add to", ItemDB.itemList);
		//Test the size of the itemList is 0 after adding in an object
		assertEquals("Test that the size of the itemList is 0 before adding any object", 0, ItemDB.itemList.size());
		//Test that the itemList is 1 after adding in an object
		ItemDB.addItem(item1);
		assertEquals("Test that the size is 1", 1, ItemDB.itemList.size());
		//Test that the item has been added
		assertSame("Test that the item has been added", item1, ItemDB.itemList.get(0));
				
	}
	@Test
	public void deleteItemTest() {
		//Test that the itemList is not null
		assertNotNull("Test that the itemList is not null", ItemDB.itemList);
		//Test that the delete based on name works and that the correct name is deleted
		ItemDB.addItem(item1);
		ItemDB.addItem(userInput);
		ItemDB.delItem(userInput);
		//Test that after the delete, the size of the arraylist decreases
		assertEquals("Test that the size of the array decreases",1,ItemDB.itemList.size());
	}
	@Test
	public void viewAllItemTest() {
		//Test that the itemList is not null
		assertNotNull("Test that the itemList is not null", ItemDB.itemList);
		//Test that the size of the array increases after adding 2 more items
		String testOutput = "";
		ItemDB.addItem(userInput);
		ItemDB.addItem(item1);
		assertEquals("Test that the size is 2", 2, ItemDB.itemList.size());
		//Test that the output is the same as the expected output
		String expectedOutput = ItemDB.itemList.toString();
		testOutput = userInput.toString();
		testOutput += item1.toString();
		
		assertEquals("Test that the output is the same as the expected output", expectedOutput, testOutput);
	}
	public void searchItemTest() {
		//Test that the itemList is not null
		assertNotNull("Test that the itemList is not null", ItemDB.itemList);
		//Test that the size of the array increases after adding 2 more items
		ItemDB.addItem(userInput);
		ItemDB.addItem(item1);
		//Test that the search function works
		ItemDB.searchItem(userSearch);
	}
	public void updateItemTest() {
		//Test that the itemList is not null
		assertNotNull("Test that the itemList is not null", ItemDB.itemList);
		//Test that the size of the array increases after adding 2 more items
		ItemDB.addItem(userInput);
		ItemDB.addItem(item1);
		//Test that the update function works
		ItemDB.updateItem(userUpdate, userUpdate2);
	}
	public void viewItemsInCategoryTest() {
		//Test that the itemList is not null
		assertNotNull("Test that the itemList is not null", ItemDB.itemList);
		//Test that the size of the array increases after adding 2 more items
		ItemDB.addItem(userInput);
		ItemDB.addItem(item1);
		//Test that the viewItemsInCategory works
		ItemDB.viewItemsInCategory();
	}
	
}
