package com.javaex.ex20;


public class ShapeApp {
	
	public static void main(String[] args) {
		
		
		 Rectangle r01 = new Rectangle(2,2,"빨강", "노랑");
		 System.out.println(r01.getWidth());
		
		Shape[]sArray = new Shape[3];
		
		
		//부모만 보인다. 자식쪽은 사용못함. //부모자식간 섞어쓰기
		Shape s01 = new Rectangle(20,20,"빨강", "노랑");//사각형
		Shape s02 = new Triangle(100, 100, "빨강", "노랑");//삼각형
		Shape s03 = new Circle(200, "파랑", "파랑");//원
		
		sArray[0] =s01;
		sArray[1] =s02;
		sArray[2] =s03;
		
	
		
		for(int i=0;  i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		//사각형의 가로값 가져오기
		System.out.println(((Rectangle)sArray[0]).getWidth());
		
		//원의 반지름
		System.out.println(((Circle)sArray[2]).getRadius());
		
		//전체면적 구하기
		for(int i= 0;  i<sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
		
		
	}

}
