
public class Category {

	private String categoryName;
	
	public Category(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	
	public void setCategoryName(String name) {
		this.categoryName = categoryName;
	}
	
	public String toString() {
		return "Category [name=" + categoryName + "]";
	}
	
	

}