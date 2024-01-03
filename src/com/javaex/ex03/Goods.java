package com.javaex.ex03;

public class Goods {
	
	//필드
	String name;
	int price;
	//생성자
	//메소드  -gs/일반
	
	public void setName(String n) {
		name = n;
	}
	
	public void setPrice(int p) {
		price = p;
	}
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	//메소드 일반
	
	public void showInfo() {
	System.out.println("------------------------------------");
	System.out.println("상품명:" + this.name + ", 가격: " + this.price);
	System.out.println("------------------------------------");
	
	}
}
