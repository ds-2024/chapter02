package com.javaex.ex20;


public class Circle extends Shape {
	

	
	//필드(자식)
	
	private int radius;
	
	
	//생성자
	

	public Circle() {
		
	}
	
	public Circle(int radius, String fillColor, String lineColor) {
	
		super(fillColor, lineColor);
		this.radius = radius;
	}


	
	//method -gs
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	
	//method -general
	
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getFillColor()=" + getFillColor() + ", getLineColor()=" + getLineColor()
				+ "]";
	}

	public void draw() {
	    // 원형을 시각화 하는 복잡한 로직작동
	    System.out.println("====원을 그렸습니다=========");
	    System.out.println("반지름:" + radius);
	    System.out.println("면색:" + super.getFillColor());
	    System.out.println("선색:" + super.getLineColor());
	    System.out.println("============================");
	}

	
	public double area() { //정 안되면 return 0.0 이라도 써줘야 구현됨.
		return 3.14*radius*radius;
	}
	

}
