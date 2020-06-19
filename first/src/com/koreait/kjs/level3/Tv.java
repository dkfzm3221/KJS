package com.koreait.kjs.level3;

//사용자 정의 class
public class Tv {
	String name; //기본적으로 null
	boolean power; // 기본적으로 false
	int channel;//기본적으로 0
	
	void changePower() {
		power = !power; //스위치처럼 쓰고싶을때
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
}
