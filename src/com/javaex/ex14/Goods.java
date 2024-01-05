package com.javaex.ex14;

public class Goods {
	
	//필드
	
	private String name;
	private int price;
	
	
	
	//생성자
	
	//기본 생성자
	
	public Goods() {

	}
	
	// 2개 변수 생성자

	public Goods(String name, int price) {

		this.name = name;
		this.price = price;
	}

	// 메소드 gs

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 메소드 일반

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	public void showinfo() {
		System.out.println("---------------------------------");
		System.out.println("상품이름:" + this.name + ", 가격:" + this.price);
		System.out.println("---------------------------------");
		
		
	}

}
