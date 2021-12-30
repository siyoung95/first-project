package application;

public class Order {
	int count = 0;
	int id;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	public Order() {
		count = count++;
		id = count;
	}
	
}
