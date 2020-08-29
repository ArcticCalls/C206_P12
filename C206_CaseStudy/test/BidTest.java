  
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BidTest {

	private Bid bid1;
	private Bid userInput;
	private String userInput2;

	private String userUpdate;
	private String userUpdate2;
	@Before
	public void setUp() throws Exception {
		
		bid1 = new Bid("S11","Vase");
		userInput = new Bid("Bid id", "Bid name");
		userUpdate = ("S12");
		userUpdate2 = ("Artworks of Mona Lisa");
	}

	@After
	public void tearDown() throws Exception {
		
		bid1 = null;
		userInput = null;
		BidDB.bidList.clear();
	}

	@Test
	public void addBidTest() {
		//Test that the bidList is not null
		assertNotNull("Test that the bidList is not null", BidDB.bidList);
		//Test the size of the bidList is 0 after adding in an object
		assertEquals("Test that the size of the bidList is 0 before adding any object", 0, CategoryDB.categoryList.size());
		//Test that the bidList is 1 after adding in an object
		BidDB.addBid(bid1);
		assertEquals("Test that the size is 1", 1, BidDB.bidList.size());
		//Test 4
		assertSame("Test 4", bid1, BidDB.bidList.get(0));
		
	}
	@Test
	public void deleteBidTest() {
		//Test that the bidList is not null
		assertNotNull("Test that the bidList is not null", BidDB.bidList);
		//Test that the delete based on name works and that the correct name is deleted
		BidDB.addBid(bid1);
		BidDB.addBid(userInput);
		BidDB.deleteBid(userInput);
		//Test that after the delete, the size of the arraylist decreases
		assertEquals("Test that the size of the array decreases",1,BidDB.bidList.size());
	}
	@Test
	public void viewAllBidTest() {
		//Test that the bidList is not null
		assertNotNull("Test that the bidList is not null", BidDB.bidList);
		//Test that every element inside the array are displayed correctly
		BidDB.viewBid();
	}
	@Test
	public void updateBidTest() {
		//Test that the categoryList is not null
		assertNotNull("Test that the bidList is not null", BidDB.bidList);
		//Test that the size of the array increases after adding 2 more items
		BidDB.addBid(userInput);
		BidDB.addBid(bid1);
		//Test that the update function works
		BidDB.updateBid(userUpdate, userUpdate2);
	}
	}
	