package com.koreait.kjs.level2;

import java.util.Arrays;

public class ArrCopy2 {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 7, 55 };
		int[] arr2 = copyArr(arr);

		System.out.println(arr == arr2);
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr2 : " + Arrays.toString(arr2));

	}

	public static int[] copyArr(int[] arr) {
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		return arr2;
	}
	
}//메소드 안에 있는 변수는 지역변수// new = 객체를 만들때 쓰는 키워드
