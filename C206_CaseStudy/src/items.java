
public class items {
	private String itemName;
	private String itemDesc;
	private Double minBid;
	private String startDate;
	private String endDate;
	private Double bidIncre;
	
	public items(String itemName, String itemDesc, Double minBid, String startDate, String endDate, Double bidIncre) {
		super();
		this.itemName = itemName;
		this.itemDesc = itemDesc;
		this.minBid = minBid;
		this.startDate = startDate;
		this.endDate = endDate;
		this.bidIncre = bidIncre;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public Double getMinBid() {
		return minBid;
	}

	public void setMinBid(Double minBid) {
		this.minBid = minBid;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Double getBidIncre() {
		return bidIncre;
	}

	public void setBidIncre(Double bidIncre) {
		this.bidIncre = bidIncre;
	}

	@Override
	public String toString() {
		return "items [itemName=" + itemName + ", itemDesc=" + itemDesc + ", minBid=" + minBid + ", startDate="
				+ startDate + ", endDate=" + endDate + ", bidIncre=" + bidIncre + "]";
	}
	
	
}
