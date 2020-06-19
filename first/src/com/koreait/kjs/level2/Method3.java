package com.koreait.kjs.level2;

public class Method3 {
	public static void main(String[] main) {
		int result = sum(30, 10);
		System.out.println(result);
		
		result = min(30,17);
		System.out.println(result);
		
	}
	
	public static int sum(int n1, int n2) { // 타입이 String 이면 타입도 String으로 변경 void 형은 = 붙일수 없음
		return n1 + n2; //return값 필수 필요한 값 만 받자
	}
	public static int min(int n1, int n2) {
		return n1 - n2; //return 키워드를 만나는 순간 종료
	}
	
	
}
