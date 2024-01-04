package com.javaex.ex09;

public class Point {

	// 필드
	private int x;
	private int y;

	// 생성자

	public Point() {
		// 메모리에 올리는 일
		System.out.println("Point()");
	}

	public Point(int x, int y) {
		// 메모리에 올리는 일
		this.x = x;
		this.y = y;
		System.out.println("Point(int x, int y) ");
	}

	// 메소드 - g,s

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	// 메소드-일반

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void draw() {
		System.out.println("점[x=" + this.getX() /*getX()메소드가 정교하다면 갖다 써도 됨*/ + ", y=" + this.y + "]를 그렸습니다.");
		

	}
	
	public void draw(boolean action) {
		if(action == true) {
			System.out.println("점[x=" + this.x + ", y=" + this.y + "]를 그렸습니다.");
		}else {
			System.out.println("점[x=" + this.x + ", y=" + this.y + "]를 지웠습니다.");
		}
	}
		
	public void delete() {
			
		System.out.println("점[x=" + this.x + ", y=" + this.y + "]를 지웠습니다.");

			
		
	}

}
