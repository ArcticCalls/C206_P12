import java.util.ArrayList;

public class ItemDB {
	public static ArrayList<items> itemList = new ArrayList<items>();
	
	public static items inputItem() {
		String name = Helper.readString("Enter item Name: ");
		String desc = Helper.readString("Enter description: ");
		Double bid = Helper.readDouble("Enter minimum bid: ");
		String startDate = Helper.readString("Enter start date: ");
		String endDate = Helper.readString("Enter end date: ");
		Double bidIncre = Helper.readDouble("Enter bid increment: ");
		items item1 = new items(name, desc, bid, startDate, endDate, bidIncre);
		return item1;
	}
	
	public static void addItem(items item1) {
		itemList.add(item1);
		System.out.println();
	}
	
	public static String viewAllItem() {
		String output = String.format("%-45s %-50s %-6s %-9s %-9s %-6s\n", "Name", "Description", "Bid($)", "StartDate", "EndDate", "BidInc");
		for (int i=0; i < ItemDB.itemList.size(); i++) {
			output += ItemDB.itemList;
		}
		return output;
	}
	
	public static void delItem(items userInput) {
		for (int i=0; i < itemList.size(); i++ ) {
			if (itemList.get(i) == userInput) {
				itemList.remove(i);
			}
		}
	}
	
	public static void searchItem(String userSearch) {
		for (int i=0; i < ItemDB.itemList.size(); i++) {
			String partialSearch = userSearch;
			String Search = ItemDB.itemList.get(i).getItemName();
			if (Search == partialSearch || Search.contains(partialSearch)) {
				System.out.println(Search);
			}
			else {
				System.out.println("Search not found. Please try again");
			}
		}
	}
	
	public static void updateItem(String userUpdate, String userUpdate2) {
		for (int i=0; i < ItemDB.itemList.size(); i++) {
			String searchUpdate = userUpdate;
			String Search = ItemDB.itemList.get(i).getItemName();
			if (Search == searchUpdate || Search.contains(searchUpdate)) {
				ItemDB.itemList.get(i).setItemName(userUpdate2);
			}
		}
	}
	
	public static String viewItemsInCategory() {
		String output = "";
		for (int i=0; i < CategoryDB.categoryList.size(); i++) {
			output += CategoryDB.categoryList.contains(ItemDB.itemList);
	}
		return output;
	}
}
