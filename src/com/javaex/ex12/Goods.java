package com.javaex.ex12;

public class Goods {
	// 필드
	private String name;
	private int price; //각자
	public static int count; // static 공통

	
	// 생성자
	public Goods() {
		count = count + 1; // 추가. 디폴트 생성자.//본인것에서 계속 1만 추가.
		 //따라서 계속 1이 나옴. 누적이 안됨.// 공통변수 써줘야함->static 공간에 올려줘야함.//동작 위주로 static에 올려줘야함.
	}
	
	public Goods(String name, int price) {
		
		this.name = name;
		this.price = price;
		count = count + 1 ; //추가
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
	

	//메소드 일반
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", count=" + count + "]";
	}
	

}
