package com.koreait.kjs.mission;

public class Mission9 {
	public static void main(String[] args) {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 2;
		}
		//int sum = 0;
		//for (int i = 0; i < arr.length; i++) {
		//	sum = arr[i] + sum;
		//	System.out.println("sum : " + sum);

		//}
		
		for(int i = 0; i<arr.length; i++) {
			if(i > 0) {
				System.out.print(", ");
			}
			
			System.out.print(arr[i]);
			
		}
		

	}
}
