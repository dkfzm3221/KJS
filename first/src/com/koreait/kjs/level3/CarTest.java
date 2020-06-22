package com.koreait.kjs.level3;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car();
		Car car1 = new Car("소나타", "흰색", 2500);
		Car car2 = new Car("그랜져");
		Car car3 = new Car("제네시스");
	//	Car car4 = new Car(3500);
		
		
		
		car.introduceMyCar();
		car1.introduceMyCar();
		car2.introduceMyCar();
		car3.introduceMyCar();
		
		System.out.println("---");
		
	}
}