package com.javaex.ex10;

public class Tv {

	// 아래 TV 클래스의 main 메쏘드를 실행할 수 있도록, 요구 조건을 참조하여 TV 클래스를 정의 하세요.
	// 1) 모든 필드는 private으로 접근 제어를 하고 getter만 작성합니다. (channel, volume, power 필드
	// read-only)
	// 2) channel, volume, power의 초기값을 각각 7, 20, false 로 초기화 하는 생성자 작성
	// 3) 기본 생성자 오버로딩
	// 4) void power( boolean on ) 메소드 구현
	// 5) void channel( int channel ) 메소드 구현 (1~255 유지)
	// 6) void channel( boolean up ) 메소드 오버로딩 (1~255 유지, 1씩 증감)
	// 7) void volume( int voluem ) 메소드 구현 ( 0 ~ 100 유지 )
	// 8) void volume( boolean up ) 메소드 오버로딩 (0 ~ 100 유지, 1씩 증감)
	// 9) void status() 메소드 구현( TV 정보 출력)

	// 필드

	private int channel;
	private int volume;
	private boolean power;

	// 생성자
	public Tv(int channel, int volume, boolean power) {
		
		//
		this.channel = channel;
		this.volume = volume;
		this.power = power;
		
		channel =7;
		volume = 20;
		power = false;
		
	}

	// 메소드 g/s
	
	
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		volume = volume;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	

	// 메소드 일반
	
	
	void power(boolean on) { 

		power = !power;

	}

	void channel(int channel) { 

		this.channel = channel;

	}

	void channel(boolean up) { 

		++channel;
	}

	void volume(int volume) {
		this.volume = volume;

	}

	void volume(boolean up) {
		++volume;
	}

	void status() {
		System.out.println("Tv [channel=" + channel + ", volume=" + volume + ", power=" + power + "]");
		
	}

	
	

}
