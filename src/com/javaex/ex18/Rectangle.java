package com.javaex.ex18;

public class Rectangle extends Shape{
	
	//필드(자식)
	private int width;
	private int height;
	
	//생성자
	public Rectangle() {
		//super(); 불러도 안불러도 ok.
		
	}

	public Rectangle(int width, int height ,String fillColor, String lineColor) {
		/*
		super();
		super.setFillColor(fillColor);
		super.setLineColor(lineColor); //세터로 하나씩 넣어주자. 부모쪽 생성자 첫번째것 호출
		
		this.width = width;
		this.height = height;
		*/
		
		super(fillColor, lineColor);// 부모쪽 생성자 두번째것 호출 //생성자는 메모리에 올리는 역할
		this.width = width;
		this.height = height; 
	}
		
	//메소드 -gs
		
		
	

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	

	//메소드 - 일반
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor();
	}

	
	
	
	
}
