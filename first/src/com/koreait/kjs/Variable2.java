package com.koreait.kjs;

public class Variable2 {
	public static void main(String[] args) {
		int num = 10;
		int num2, num3 = 20;
		int num4 = 10, num5 = 20;
		
		//이름 주의사항!
		//1. 소문자 시작! (가능한 카멜 케이스 기법 사용) ex) in myMaxHeight;
		//2. 특수기호는 _(언더바), $(달러)만 사용가능 - 특수기호로 시작해보 무방!
		//3. 숫자로 시작 불가능 뒤에 붙이는건 가능 ex) int 12a; (X) , int top10;(O) , int top10Good(O)
		//4. 예약어(보라색) 사용금지 ex) int char;
		//5. 변수명 띄우면 안됨
		//6. 대소문자를 가림.ex) int aa, aA, Aa, AA; 모두 다른변수
		
		final int MY_MAX_HIEGHT = 1_000_000;
		
		final int HIEGHT;
		HIEGHT = 100;
		//HIEGHT = 120;(x)
		System.out.println(MY_MAX_HIEGHT);
		
		//7. 상수명은 무조건 대문자, 구분은 언더바로 한다.(개발자간의 룰) 
	}
}
