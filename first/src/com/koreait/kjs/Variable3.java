package com.koreait.kjs;

public class Variable3 {
	public static void main(String[] args) {
		int n1 = 10;
		long n4 = 222222;
		float n2 = 50.2f; //자동으로 형변환
		
		int result = (int)n2 + n1;
		double n3 = n2; 
		
		System.out.println(n1);
		System.out.println(n2);
	}
}
