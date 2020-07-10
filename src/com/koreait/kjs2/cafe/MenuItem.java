package com.koreait.kjs2.cafe;

public class MenuItem {
	private String name;
	private int price;

	public MenuItem(String name, int price) {
		this.name = name; // 멤버필드에 값을 넣기위해 이름이 같으면 가까운 변수를 씀
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return String.format("%s\t\t%,d", name, price);
	}

}
//class 에는 멤버필드와 메소드
//private 값넣기 생성자, set / 값빼기 메소드 get
//메소드와 생성자가 다른점은 생성자는 클래스명과 같고 리턴타입이 없음
//this 나 자신의 주소값