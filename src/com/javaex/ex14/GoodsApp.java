package com.javaex.ex14;

public class GoodsApp {

	public static void main(String[] args) {
		
		//배열만들기 //세트로 관리
		Goods[] goodsArray = new Goods[3];
		
		
		//상품만들기
		Goods camera = new Goods("니콘", 400000);
		
		Goods computer = new Goods("LG그램", 900000);
		
		Goods cup = new Goods("머그컵", 2000);
		
		//배열에 상품 넣기
		
		goodsArray[0] = camera;
		goodsArray[1] = computer;
		goodsArray[2] = cup;
		
		
		
		
		System.out.println(camera.getName());//0x333 작동
		System.out.println(goodsArray[0].getName());//0x333이 0번방에 주소에 들어 있어서 결국 같은 애.
		System.out.println(computer.getPrice());
		System.out.println(goodsArray[1].getPrice());
		
		camera.showinfo();
		computer.showinfo();
		cup.showinfo();
		
		goodsArray[0].showinfo();
		goodsArray[1].showinfo();
		goodsArray[2].showinfo();
		
		int count = 0;
		for(int i=0; i<goodsArray.length; i++) {
			if(goodsArray[i] != null) {//이중부정. 따라서 주소가 있으면
				//카운트+
				goodsArray[i].showinfo();
				
				count=count+1;
				//count+=1;
				//count++;
			}
			
		}

		System.out.println("전체상품갯수:"+ count);
	}

}
