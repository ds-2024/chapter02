package com.javaex.ex20;

public abstract class Shape { //abstract 위치.
	
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
			
			public abstract void draw();// abstract void 면 내용 없으니까 {} 써주면 에러뜸
			
			//면적구하는 메소드
			
			public abstract double area(); //부모 자체로 기능 없음. 껍데기만 있는 상태. 자식이 수행해줘야 구현.
}
