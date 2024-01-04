package com.javaex.ex06;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	
	//생성자
	public Goods() {
		//메모리에 올리는 일 (클래스를 인스턴스화)
		System.out.println("Goods()");
		//리턴이 없음
		//if 없애고 public Goods(String name)만 남겨두면
		//에러 발생 <- 디폴트 생성자 사라지니까
		//처음값 메모리 올려주는 역할 없어짐.
	}
	
	public Goods(String name) {
		//메모리에 올리는 일 (클래스를 인스턴스화)
	this.name = name; //추가
	System.out.println("Goods(name)");
	}
	
	public Goods(String name,  int price) {
		//메모리에 올리는 일 (클래스를 인스턴스화)
		this(name); // 기존 생성자 중에 1개 호출 문법꼴
		this.price = price; //추가 1개
		System.out.println("Goods(name, price)");

		}
	
	//메소드

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
	
	@Override
	
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	

}
