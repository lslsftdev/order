package entities;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	private Product product;
	/**
	 * @param quantity
	 * @param price
	 * @param p
	 */
	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * @return the p
	 */
	public Product getProduct() {
		return product;
	}
	/**
	 * @param p the p to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Double subTotal() {
		return quantity * price;
	}

	@Override
	public String toString() {
		return getProduct().getName() 
					+ ", $" + String.format("%.2f", getProduct().getPrice())
					+ ", Quantity: " + quantity 
					+ ", " + "Subtotal: $" + String.format("%.2f", subTotal());  
	}
	
}
