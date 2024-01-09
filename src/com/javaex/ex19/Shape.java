package com.javaex.ex19;

public class Shape {
	
	//필드 (부모)
	
		private String fillColor;
		private String lineColor;
		
		
		//생성자

		public Shape() {
			
		}
		
		public Shape(String fillColor, String lineColor) {


			this.fillColor = fillColor;
			this.lineColor = lineColor;
		}
		
		//메소드 -gs

		public String getFillColor() {
			return fillColor;
		}

		public void setFillColor(String fillColor) {
			this.fillColor = fillColor;
		}

		public String getLineColor() {
			return lineColor;
		}

		public void setLineColor(String lineColor) {
			this.lineColor = lineColor;
		}

		
		//메소드 -일반
		
		@Override
		public String toString() {
			return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
		}
		
		
		
		//draw() x // draw 와 print 차이 (feat. 오버라이딩)
		public void draw() {
			System.out.println("Shape.draw()");
			
		}

}
