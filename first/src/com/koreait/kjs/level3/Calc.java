package com.koreait.kjs.level3;

public class Calc {
	 int n1;
	 int n2;// 폴더만들기 전역변수는 모든 메소드에서 사용가능
	
	
	public static int sum(int a, int b) {
		return a + b;

	}

	public int sum()  {
		return n1 + n2;		
		
	}
}
//static이 붙으면 class(이름).으로 접근
//static이 안붙으면 주소값.으로 접근