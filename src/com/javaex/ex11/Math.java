package com.javaex.ex11;

public class Math {
	
	//필드
	
	//생성자
	
	//메소드 g/s
	
	//메소드 일반 //생성자 오버로딩 쓰면 plus 로 int double 다 계산 할 수 있음.(파라미터 달라서)
	
	public int iPlus /*plus*/(int a, int b) {
		
		int sum = a+b; //복잡한 식
		return sum;
	
	}
	
	public double diPlus/*plus*/(double a, int b) {
		double sum = a+b;//자동형변환 (double 형+ int 형 > double 로 맞춰짐)
		return sum;
	}

	public double idPlus/*plus*/(int a, double b) {
		double sum = a+b;
		return sum;
	}
	
	public double ddPlus/*plus*/(double a, double b) {
		double sum = a+b;
		return sum;
	}
	
	public String plus(String a, double b) {
		String sum = a;
		for(int i=0; i<b; i++) {
			sum =  sum + a;
			
		}
		return sum;
	}
}
