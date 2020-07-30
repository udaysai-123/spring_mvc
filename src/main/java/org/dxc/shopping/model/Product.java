package org.dxc.shopping.model;

public class Product {
	private int pid;
	private String pName;
	private int quantity;
	private double price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pName, int quantity, double price) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.quantity = quantity;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pName=" + pName + ", quantity=" + quantity + ", price=" + price + "]";
	}
	

}
