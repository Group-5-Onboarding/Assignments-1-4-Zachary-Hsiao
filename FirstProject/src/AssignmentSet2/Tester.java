package AssignmentSet2;

public class Tester {

	public static void main(String[] args) {
		Order order = new Order();
		order.orderId = 123;
		order.orderedFoods = "Hamburger";
		order.status = "Ordered";
		order.calculateTotalPrice(10);
		order.displayDetails();
		
		System.out.println();
		
		Restaurant rest = new Restaurant("MCD", 12345L, "123 yes street", 5f);
		rest.displayRestaurantDetails();
		
		System.out.println();
		
		Order order2 = new Order();
		order2.displayDetails();
		
		System.out.println();
		
		Order order3 = new Order(1234, "hotdog");
		order3.displayDetails();
	}

}
