package com.koreait.kjs.level2;

import java.util.Arrays;

public class ArrCopy {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 7, 15 };
		int[] arr2 = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		

		System.out.println(arr == arr2);
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr2 : " + Arrays.toString(arr2));

	}
}
