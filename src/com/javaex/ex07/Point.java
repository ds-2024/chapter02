package com.javaex.ex07;

public class Point {

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {
		//메모리에 올리는일
		//확인차 작동되는지
		System.out.println("Point()");
		
	}
	
	public Point(int x) {
		//메모리에 올리는일
		this.x = x;
		//확인차 작동되는지
		System.out.println("Point(int x)");
				
		
	}
	
	//public Point(int y) {}
		//메모리에 올리는일
		//this.y = y; //오류 발생. 자료형 동일
		//따라서 오버로딩이 안됨.
		
	public Point(int x, int y) {
		//메모리에 올리는 일
		this(x);//생성자의 임무를 다하는 메소드라서 순서 바뀌면 오류 발생.
		this.y =y;
		System.out.println("Point (int x, int y)");
	}
	

	// 메소드gs
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	
	// 메소드 일반
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void draw() {
		System.out.println("점[x=" + this.x + ", y=" + this.y + "]를 그렸습니다.");
	}

}
