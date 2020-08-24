import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ItemsTest {
	private items item1;
	private items userInput;
	private ArrayList<items> itemList;
	
	public ItemsTest() {
		super();
	}
	
	@Test
	public void addItemTest() {
		//Test that the itemList is not null
		assertNotNull("Check if there is valid items arraylist to add to", itemList);
		//Test the size of the itemList is 0 after adding in an object
				assertEquals("Test that the size of the itemList is 0 before adding any object", 0, ItemDB.itemList.size());
				//Test that the itemList is 1 after adding in an object
				ItemDB.addItem(itemList, item1);
				assertEquals("Test that the size is 1", 1, ItemDB.itemList.size());
				//Test 4
				assertSame("Test 4", item1, ItemDB.itemList.get(0));
				
			}
			@Test
			public void deleteItemTest() {
				//Test that the itemList is not null
				assertNotNull("Test that the itemList is not null", ItemDB.itemList);
				//Test that the delete based on name works and that the correct name is deleted
				ItemDB.addItem(itemList, item1);
				ItemDB.addItem(itemList, userInput);
				ItemDB.delItem(userInput);
				//Test that after the delete, the size of the arraylist decreases
				assertEquals("Test that the size of the array decreases",1,ItemDB.itemList.size());
			}
			@Test
			public void viewAllItemTest() {
				//Test that the itemList is not null
				assertNotNull("Test that the itemList is not null", ItemDB.itemList);
				//Test that every element inside the array are displayed correctly
				ItemDB.viewAllItem();
			}
	
}
