package com.koreait.kjs.level3;

public class TvTest {
	public static void main(String[] args) {
		Tv tv1 = new Tv(); //주소값을 담고있는 친구가 필요 
		
		System.out.println("name: " + tv1.name);
		System.out.println("power: " + tv1.power);
		System.out.println("channel: " + tv1.channel);
		
		System.out.println("------------");	
		tv1.name = "삼성Tv";
		System.out.println("name: " + tv1.name);
		tv1.changePower();//void형은 (=) 불가!
		System.out.println("power: " + tv1.power);
		tv1.changePower();
		System.out.println("power: " + tv1.power);
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		System.out.println("channel : " + tv1.channel);
		
	}
}
