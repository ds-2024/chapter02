package com.javaex.ex12;

public class GoodsApp {
	
	//필드 -> 성격상 필요없음. 자기 데이터 저장하는 성격. 
	
	//생성자 -> 최소 하나는 필요. 디폴트 자동작용 중
	
	//메소드 gs ->  필드 없어서 get set 없어도 됨.
	
	//메소드 일반 -> show info, draw 등 일반 메소드만 있게됨.

	public static void main(String[] args) {
		
		System.out.println(Goods.count);
		
		Goods camera = new Goods("니콘", 400000);
		System.out.println(camera.toString());
		
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);
		System.out.println(computer.toString());
		
		Goods cup = new Goods("머그컵", 2000);
		System.out.println(cup.toString());
		
		//cup.setCount(100); //setCount() 없는게 좋다
		//System.out.println(cup.toString());
		
		System.out.println(cup.getCount());//전체 몇개니//카운트 해주긴 하지만 전역변수라서 굳이 코드를 저렇게 짤 필요X
		System.out.println(computer.getCount());
		
		System.out.println(Goods.count);//클래스명 카운트//대문자.count -> 전역변수
		



	}

}
