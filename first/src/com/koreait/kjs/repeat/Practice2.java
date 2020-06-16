package com.koreait.kjs.repeat;

public class Practice2 {

	public static void main(String[] args) {
		// 랜덤값 뽑기
// 0~n까지 범위를 뽑고싶다 하면 Math.random() *(n+1)
		// 0~15
	//	double r = Math.random();
	//	int rVal = (int) (r * 16);
	//	System.out.println(rVal);

		// 줄여서
	//	int rVal2 = (int) (Math.random() * 16);
	//	System.out.println(rVal2);

		// 1~15
		
	//	int rVal3 = (int) (Math.random() * 15 + 1);
	//	30~50
	//	int rVal4 = (int)(Math.random() * 21 + 30 );
	//	System.out.println(rVal4);
		
		// 46~77
	//	int rVal5 = (int)(Math.random() * 32 + 46);
	//	System.out.println(rVal5);
	//	88~99
		int rVal6 = (int)(Math.random() * 12 + 88);
		System.out.println(rVal6);
	}
		
}
