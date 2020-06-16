package com.koreait.kjs;

public class Operator6 {
	public static void main(String[] args) {
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		
		
		System.out.println(str1 == str2); //같은 주소값이냐
		System.out.println(str1.equals(str2));//순서 상관x 문자열은 같은 값비교
		System.out.println("안녕".equals(str1));//추천
	}
}
