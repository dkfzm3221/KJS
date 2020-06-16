package com.koreait.kjs.level2;

public class ArrayOrder3 {
	public static void main(String[] args) {
		// 버블정렬
		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 19 };
		int temp = 0;

		
		
//		for(int i = arr.length-1; i>0; i--) {
//			for (int z = 0; z < i; z++) {
//				if(arr[z] > arr[z+1]) {
//					temp = arr[z];
//					arr[z] = arr[z+1];
//					arr[z+1] = temp;
//					
					
			
		
		
		
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int z = 0; z < arr.length - i - 1; z++) {
				if (arr[z] > arr[z + 1]) {
					temp = arr[z];
					arr[z] = arr[z + 1];
					arr[z + 1] = temp;

				}
			}
		}
		for (int val : arr) {
			System.out.print(val + ", ");
		}
	}
}
