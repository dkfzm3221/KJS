package com.koreait.kjs;

public class Operator7 {
	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 5;
		int n3 = 6;
		
		System.out.println((n1 == n2) && (n1 == n3) && (n2 == n3)); //and 연산자 true 나오기 힘듬
		System.out.println(n1 == n2 || n1 == n3 || n2 == n3); //or 연산자 false 나오기 힘듬
	}
}
