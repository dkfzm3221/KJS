package com.koreait.kjs.level2;

public class ArrayOrder {
	public static void main(String[] args) {
		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 19 };

		// int a = arr[0];
		// int b = arr[1];

		// arr[0] = b;
		// arr[1] = a;

		// int temp = arr[0];
		// arr[0] = arr[1];
		// arr[1] = temp;

		// System.out.println("arr[0] : " + arr[0]);
		// System.out.println("arr[1] : " + arr[1]);

		// 순차정렬

		for (int i = 0; i < arr.length - 1; i++) {
			for (int z = i + 1; z < arr.length; z++) {
				if (arr[i] > arr[z]) {
					int temp = arr[i];
					arr[i] = arr[z];
					arr[z] = temp;

				}

			}
		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + ", ");
//		}



		for (int val : arr) {
			System.out.print(val + ", ");

		}

	}
}
