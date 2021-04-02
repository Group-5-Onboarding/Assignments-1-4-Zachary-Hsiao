package AssignmentSet4;

public class Order {
	private int orderId;
	private double totalPrice;
	private String status;
	private Food[] orderedFoods;
	private static int orderIdCounter;
	
	static {
		orderIdCounter = 0;
	}
	
	public Order() {
		this.status = "Ordered";
		orderId = 101;
	}
	
	public Order(Food[] orderedFoods) {
		this.orderedFoods = orderedFoods;
		orderId = 101;
	}
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Food[] getOrderedFoods() {
		return orderedFoods;
	}

	public void setOrderedFoods(Food[] orderedFoods) {
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
	
	public static int getOrderIdCounter() {
		return orderIdCounter;
	}

	public static void setOrderIdCounter(int orderIdCounter) {
		Order.orderIdCounter = orderIdCounter;
	}


	
	public double calculateTotalPrice(int unitPrice) {
		totalPrice = 0.05 * unitPrice;
		return totalPrice;
	}
	
	
	public void displayDetails() {
		System.out.println("order ID: " + orderId);
		System.out.println("orderedFoods: ");
		for (int i = 0; i < orderedFoods.length; i++) {
			System.out.println(orderedFoods[i] + " ");
		}
		System.out.println("Total Price: " + totalPrice);
		System.out.println("status: " + status);
	}
}
