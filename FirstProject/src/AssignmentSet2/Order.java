package AssignmentSet2;

public class Order {
	public int orderId;
	public String orderedFoods;
	public double totalPrice;
	public String status;
	
	public Order() {
		this.status = "Ordered";
	}
	
	public Order(int orderId, String orderedFoods) {
		this.orderId = orderId;
		this.orderedFoods = orderedFoods;
	}
	
	public double calculateTotalPrice(int unitPrice) {
		totalPrice = 0.05 * unitPrice;
		return totalPrice;
	}
	
	
	public void displayDetails() {
		System.out.println("order ID: " + orderId);
		System.out.println("orderedFoods: " + orderedFoods);
		System.out.println("Total Price: " + totalPrice);
		System.out.println("status: " + status);
	}
}
