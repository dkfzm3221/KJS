package com.koreait.kjs.level2;

public class Array2 {
	public static void main(String[] args) {
		int[][] arr= new int[2][3];
		
		int[][] arr2 = {
				{10, 20, 30},
				{12, 13, 14,11}
		};
		
		for(int i = 0; i<arr2.length; i++) {
			for(int z=0; z<arr2[i].length; z++) {
				System.out.print(arr2[i][z]+", ");
			}
			System.out.println();
		}
		//int[][][] arr3 = new int[3][4][5] - 구분되어져있다.
//		System.out.println(arr.length);
//		System.out.println(arr2.length);
//		System.out.println(arr[0].length);
//		System.out.println(arr2[1].length);
	}
}
