package application;

public class Hamburger {
	private String name;
	private int price;
	
	public Hamburger (String name, int price) {
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
