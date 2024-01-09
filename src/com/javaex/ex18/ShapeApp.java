package com.javaex.ex18;

import com.javaex.ex17.Circle;
import com.javaex.ex17.Rectangle;
import com.javaex.ex17.Triangle;

public class ShapeApp {

	public static void main(String[] args) {
		
		
		//도형(부모) //스코프!!!!!! 항상 주의!!!!!!!
		Shape s01 = new Shape();
		s01.setFillColor("노랑");
		s01.setLineColor("검정");
		System.out.println(s01.toString());
		
		
		//사각형(call by child)
		Rectangle r01 = new Rectangle();
		
		//배열 생성
		Rectangle[]rArray =  new Rectangle[2];
		Triangle[]tArray = new Triangle[3];
		Circle[]cArray =  new Circle[3];
	
		
		r01.setWidth(3);
		r01.setHeight(30);
		r01.setFillColor("빨강");
		r01.setLineColor("검정");
		
		System.out.println(r01.toString()); //부모쪽
		
		Rectangle r02 = new Rectangle(40, 40, "파랑", "검정");
		System.out.println(r02.toString());
		
		//삼각형(call by child)
		Triangle t01 = new Triangle();
		t01.setWidth(6);
		t01.setHeight(20);
		t01.setFillColor("노랑");
		t01.setLineColer("검정");
		
		Triangle t02 = new Triangle(20, 20,"노랑", "검정");
		
		rArray[0] = r01;
		rArray[1] = r02;
		
		for (int i=0; i<rArray.length; i++) {
			System.out.println(rArray[i].toString());
		}
		
		
		
		
	

	
	
	
	}
	
}
