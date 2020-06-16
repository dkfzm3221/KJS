package com.koreait.kjs;

public class Switch {
	public static void main(String[] args) {
		
		String num = "이";
		
		switch(num) {
		case "일":
			System.out.println("1이다.");
			
			break;
		case "이": case "사" : System.out.println("짝수이다");
			break;
			
		case "삼":
			System.out.println("3이다");
			break;
			
		default:
			System.out.println("1~3이 아니다.");
			break;
		}
	}
}
//swich는 폭포수 break문이 없으면 break 나올때까지 실행