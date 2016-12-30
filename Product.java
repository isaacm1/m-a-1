package auth;

public class Product { // class
	private String name;
	private int cost;
	private int price;
	private int inventory; // member variables
	
	public Product() {
		
	}

	public Product(String name, int cost, int price, int inventory) { // constructor
																		// for
																		// Product
		this.name = name;
		this.cost = cost;
		this.price = price;
		this.inventory = inventory;
	} // member values set

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getCost() {
		return cost;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	public int getInventory() {
		return inventory;
	}

	private int getTotalCost() {
		return cost * inventory;
	}

	private int getTotalPrice() {
		return price * inventory;
	}

	public int getProfit() {
		return getTotalPrice() - getTotalCost();
	}

	public String toString(){
	return "Name: " + name + ", Cost: " + cost + ", Price " + price + ", Inventory: " + inventory; 
	}
}
