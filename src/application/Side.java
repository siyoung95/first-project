package application;

public class Side {
	private String name;
	private int price;
	
	public Side (String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
}
