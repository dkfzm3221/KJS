package com.koreait.kjs.level2;

public class Mathod4 {

	public static void main(String[] args) {
		sum(4,5);
		sum(5, 7, 9);
		sum(1, 2, 3, 4);

	}
	public static void sum(int ...arr) { //배열로 만들어짐
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum : " + sum);
	}

}
