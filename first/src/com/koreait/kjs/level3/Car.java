package com.koreait.kjs.level3;

public class Car {//extends Objcet 자동 입력
	String name;
	String color;
	int cc;
	
	
	public Car() {//생성자이름 = 클래스이름이 같다. return타입이 없다. void들어가는순간 메소드
		System.out.println("Car 기본생성자!");//오버로딩 가능
	}
	
	
		//()소괄호 기본생성자호출 생략가능
		//지역변수명이 전역변수명과 같을때  this. 붙여야함
	
	public Car(String name, String color, int cc) {
		super();
		this.name = name;
		this.color = color;
		this.cc = cc;
	}
	public void introduceMyCar() {
		System.out.printf("%s의 컬러는 %s이고 %dcc이다.\n", name, color, cc);
	}

}
//super; 내 부모 this; 