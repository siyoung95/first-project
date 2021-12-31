package application;

import java.util.ArrayList;

public class Order {
	private ArrayList<Product> cart = new ArrayList<>();
	
	public Order(ArrayList<Product> cart) {
		this.cart.addAll(cart);
	}
	
	public ArrayList<Product> getCart() {
		return cart;
	}

	public void setCart(ArrayList<Product> cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		String s = "";
		for(Product p : cart ) {
			s += p.toString();
		}
		return s;
	}

}
