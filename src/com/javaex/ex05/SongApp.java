package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		
		Song IU = new Song();
		IU.setAlbum("Real");
		IU.setArtist("아이유");
		IU.setComposer("이민수");
		IU.setTitle("좋은날");
		IU.setTrack(3);
		IU.setYear(2010);
		
		IU.showInfo();
		
		Song BB = new Song();
		BB.setAlbum("Always");
		BB.setArtist("BIGBANG");
		BB.setComposer("G-DRAGON");
		BB.setTitle("거짓말");
		BB.setTrack(2);
		BB.setYear(2007);
		
		BB.showInfo();
		
		Song BK = new Song();
		BK.setAlbum("버스커버스커1집");
		BK.setArtist("버스커버스커");
		BK.setComposer("장범준");
		BK.setTitle("벚꽃엔딩");
		BK.setTrack(4);
		BK.setYear(2012);
		
		BK.showInfo();
		
		
		

	}

}
