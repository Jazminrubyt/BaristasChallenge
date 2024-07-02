
public class TestOrders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item1 = new Item("Mocha", 3.7);
		Item item2 = new Item("Latte", 3.2);
		System.out.println(item1.getName());
		System.out.println(item1.getPrice());
		
		Order order1 = new Order();
		order1.addItem(item1);
		order1.addItem(item2);
		System.out.println(order1.getName());
		System.out.println(order1.getItems());
		System.out.println(order1.getStatusMessage());
		order1.setReady(true);
		System.out.println(order1.getStatusMessage());
		System.out.println(order1.getOrderTotal());
		
		
		Order order2 = new Order("Dory");
		System.out.println(order2.getName());
		
	}

}