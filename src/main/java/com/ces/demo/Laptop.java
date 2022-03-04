package com.ces.demo;

public class Laptop  implements Comparable<Laptop> {
	

	private String name;
	private Integer price;
	private Integer ram;
	
	public Laptop(String name, Integer price, Integer ram) {
		super();
		this.name = name;
		this.price = price;
		this.ram = ram;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}


	@Override
	public String toString() {
		return "Laptop [name=" + name + ", price=" + price + ", ram=" + ram + "]";
	}

	@Override
	public int compareTo(Laptop ob) {
		if(this.ram > ob.getRam())
			return 1;
		return -1;
	}
	
	

}