package com.javaex.ex16;

public class ColorPoint extends Point{
	
	//필드
	
		//private int x;
		
		//private int y;
		
		private String color;
		
	//생성자
	
		public ColorPoint() {
		
		//super();
			System.out.println("ColorPoint()");
		
	}
		public ColorPoint(String color) {
			//부모의 기본생성자 호출
			super();
			this.color = color;
			System.out.println("ColorPoint(1)");
		}
	
		
		public ColorPoint(int x, int y, String color) {
			super(); //부모의 기본 생성자 호출
			super.setX(x);
			super.setY(y);
			this.color = color;
			System.out.println("ColorPoint(3)");
		}
		


	//메소드 -gs // private 로 막아서
		
		public String getColor() {
			return color;
		}

		

		public void setColor(String color) {
			this.color = color;
		}


		
		
	//메소드 -일반
		
		@Override
		public String toString() {
			return "ColorPoint [color=" + color + "]";
		}
		

		public void draw() {
			System.out.println("점[x=" +super.getX() + ", y=" + super.getY() + "색=" + this.color + "]을 그렸습니다." );
			
		}
	
	

}
