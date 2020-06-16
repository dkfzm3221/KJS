package com.koreait.kjs;

public class Variable {
	public static void main(String[] args) {
		char v1; //변수 타입들 문자형
		v1 = 'A';								//리터럴 값이다 고유값
		System.out.println(v1);				
		System.out.println('A');
		
		v1 = 'B';
		System.out.println(v1); //변수 선언은 1번
		
		
		byte v2; //정수형
		short v3;//정수형
		int v4; //정수형
		long v5;//정수형
		
		v2 = (byte)128;//강제 형변환 
		v3 = 20; //자동 형변환
		v4 = 30;
		v5 = 50;
		
		System.out.println();
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		
		
		float v6; //실수형 속도 빠름
		v6 = (float)10.1;
		v6 = 10.1f;
		v6 = 10.1F;
		
		double v7; //실수형 <추천> 더 정확
		v7 = 10.1;
		
		v6 = (float)v7;
		
		
		System.out.println();
		
		boolean v8; //참, 거짓
		
		System.out.println();
		
		v8 = true;
		System.out.println(v8);
		v8 = false;
		System.out.println(v8);
		
		
		String r1; //타입이 대문자면 레퍼런스 변수 
		r1 = "안녕하세요.";
		System.out.println(r1);
		Variable r2;
	}
}
