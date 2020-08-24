import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ItemsTest {
	private ArrayList<items> itemList;
	
	public ItemsTest() {
		super();
	}
	
	@Test
	public void addItemTest() {
		assertNotNull("Check if there is valid items arraylist to add to", itemList);
		
	}
	
}
