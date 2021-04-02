package AssignmentSet3;

public class Order {
	private int orderId;
	private String orderedFoods;
	private double totalPrice;
	private String status;
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderedFoods() {
		return orderedFoods;
	}

	public void setOrderedFoods(String orderedFoods) {
		this.orderedFoods = orderedFoods;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

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
