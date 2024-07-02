import java.util.ArrayList;
public class Order {
	private String name;
	private boolean isReady;
//	private ArrayList<Item> items = new ArrayList<>();
	private ArrayList<Item> items;
	
	
//	 constructors
	public Order() {
		this.name = "Guest";
		items = new ArrayList<Item>();
		
		
		
	}

	public Order(String name) {
		this.name = name;
		items = new ArrayList<Item>();
	}
	
//	Other Methods 
	
//	Create a method called addItem that takes an Item object as an argument and adds the item to the order's items array. No need to return anything.
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	
	
//	Create a method called getStatusMessage that returns a String message. If the order is ready, return "Your order is ready.", if not, return "Thank you for waiting. Your order will be ready soon."
	public String getStatusMessage() {
		if (this.isReady == true) {
			return "Your order is ready";
		}
		else {
			return " Thank you for waiting. Your order will be ready soon.";
		}
	}
	
	
//	Similar to the getOrderTotal method from the Cafe Business Logic assignment, create a method called getOrderTotal that sums together each of the item's prices, and returns the total amount.
//	Note: This time, you do not need to pass in a list of prices, because each item object in this order's items array has its own price, that you can access using a getter!
	public double getOrderTotal() { 
		double total = 0;
		for (Item item : items) {
			total += item.getPrice();
		}
		 return total;
	}
	 
	 
	
	 
//	Getters and setters 

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isReady() {
		return isReady;
	}


	public void setReady(boolean isReady) {
		this.isReady = isReady;
	}


	public ArrayList<Item> getItems() {
		return items;
	}


	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
}
