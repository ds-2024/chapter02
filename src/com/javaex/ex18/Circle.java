package com.javaex.ex18;

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


	
	
	
	
	
	
	
	
	

}
