package com.koreait.kjs.level2;

public class NomalVsRef {
	public static void main(String[] args) {
		int num = 10;
		System.out.println("befor num : " + num);
		changeVal(num);
		System.out.println("after num : " + num);
		
		int[] numArr = {10};//영향을 끼치지 못함
		System.out.println("before numArr[0] : " + numArr[0]);
		changeVal(numArr);
		System.out.println("after numArr[0] : " + numArr[0]);
		
	}
	public static void changeVal(int num) {
		num = 30;
	}
	public static void changeVal(int[] numArr) {
		numArr[0] = 30;
	}
}
