package com.jsp.comparator;

public class Shirt {
	Integer id;
	String brand;
	Integer size;
	Double price;
	public Shirt(Integer id, String brand, Integer size, Double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.size = size;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Shirt [id=" + id + ", brand=" + brand + ", size=" + size + ", price=" + price + "]";
	}
}
