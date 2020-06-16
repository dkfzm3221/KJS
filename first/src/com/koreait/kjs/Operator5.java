package com.koreait.kjs;

public class Operator5 {
	public static void main(String[] args) {
		//비교 연산자 > boolean
		
		int n1 = 12;
		int n2 = 11;
		boolean result = (n1 == n2);
		System.out.println(result);
		System.out.println(n1 == n2); // (==) 비교연산자 (!) 붙이면 반대값 피연산자는 무조건 2개
		System.out.println(n1);		// (==) 문자열 비교는 절대 안됨
		
		System.out.println();
		result = (n1 != n2); // n1과 n2가 다르니?
		System.out.println(result);
		System.out.println(n1 != n2);
		
		System.out.println();
		result = n1 >= n2;
		System.out.println("n1 > n2 : " + result);
		result = n2 <= n1;
		System.out.println("n1 > n2 : " + result);
	}
}
























