package com.javaex.ex11;

public class MathApp {

	public static void main(String[] args) {
		
		//
		 Math math = new Math();//생성자라서 클래스 필요
		 
		 System.out.println(math.iPlus/*plus*/(2,3));
		 System.out.println(math.iPlus/*plus*/(100,300));
		 
		 System.out.println(math.diPlus/*plus*/(2.2, 5));
		 System.out.println(math.idPlus/*plus*/(5, 2.2));
		 
		 System.out.println(math.ddPlus/*plus*/(5.5, 2.2));
		 
		 System.out.println(math.plus("안녕하세요", 2));

	}

}
