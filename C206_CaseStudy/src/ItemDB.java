import java.util.ArrayList;

public class ItemDB {
	static ArrayList<items> itemList = new ArrayList<items>();
	
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
	
	public static void addItem(ArrayList<items> itemList, items item1) {
		itemList.add(item1);
		System.out.println();
	}
	
	public static String retrieveAllItems(ArrayList<items> itemList) {
		String output = "";
		for (int i = 0; i < itemList.size(); i++) {
			output += String.format("%-230s\n", itemList.get(i).toString());
		}
		return output;
	}
	
	public static void viewAllItem() {
		String output = String.format("%-45s %-150s %-6s %-9s %-9s %-6s\n", "Name", "Description", "Bid($)", "StartDate", "EndDate", "BidInc");
		output += retrieveAllItems(itemList);
		System.out.println(output);
	}
	
	public static void delItem(items userInput) {
		for (int i=0; i < itemList.size(); i++ ) {
			if (itemList.get(i) == userInput) {
				itemList.remove(i);
			}
		}
	}
}
