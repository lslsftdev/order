package entities;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	private Product p;
	/**
	 * @param quantity
	 * @param price
	 * @param p
	 */
	public OrderItem(Integer quantity, Double price, Product p) {
		this.quantity = quantity;
		this.price = price;
		this.p = p;
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
	public Product getP() {
		return p;
	}
	/**
	 * @param p the p to set
	 */
	public void setP(Product p) {
		this.p = p;
	}
	
	public Double subTotal() {
		return quantity * price;
	}

	@Override
	public String toString() {
		return getP().getName() 
					+ ", $" + String.format("%.2f", getP().getPrice())
					+ ", Quantity: " + quantity 
					+ ", " + "Subtotal: $" + String.format("%.2f", subTotal());  
	}
	
}
