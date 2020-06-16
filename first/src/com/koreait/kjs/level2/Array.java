package com.koreait.kjs.level2;

public class Array {
	public static void main(String[] args) {
		// [] 100% 배열
		int[] arr = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		char[] arr2 = new char[20];
		float[] arr3 = new float[10];
		String[] arr4 = new String[200];
		// 주소값이 없으면 null값 boolean false 값 / 배열을 쓰는이유 : 변수선언을 줄이기위해 ,for문과 찰떡궁합
		int[] arr5 = { 10, 20, 30, 40 };
		int[] arr6 = arr5;

		System.out.println(arr[0]);
		System.out.println(arr[1]);

		System.out.println("--------------------");

		int[] arr7 = new int[100];

		for (int i = 0; i < arr7.length; i++) {
			arr7[i] = 5;
		}

		for (int i = 0; i < arr7.length; i++) {
			System.out.println(arr7[i]);
		}

	}
}
