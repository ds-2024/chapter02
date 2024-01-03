package com.javaex.ex05;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public void setTitle(String t) {
		this.title = t;
	}
	
	public void setArtist(String art) {
		this.artist = art;
    }
	
	public void setAlbum(String al) {
		this.album = al;
	}
	
	public void setComposer(String c) {
		this.composer = c;
	}

	public void setYear(int y) {
		this.year =y;
	}
	
	public void setTrack(int tr) {
		this.track = tr;
	}
	
	public String getTitle() {
		return this.title;
	}
	public String getArtist() {
		return this.artist;
	}
	public String getAlbum() {
		return this.album;
	}
	public String getComposer() {
		return this.composer;
	}
	public int getYear() {
		return this.year;
	}
	public int getTrack() { 
		return this.track;
	}
	
	public void showInfo() {
		System.out.println(this.artist +","+ this.title + " ( " + this.album + ", " + this.year+ ", "+ this.track+ "번 track, " + this.composer + " 작곡 )" );
	}
}



